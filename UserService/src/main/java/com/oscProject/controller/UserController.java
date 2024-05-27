package com.oscProject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oscProject.entities.*;
import com.oscProject.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private OTPMailService otpMailService;
    @Autowired
    private UserDataCachingService userDataCachingService;

    String emailID = "";
    String jsonString= "";
    @Autowired private KafkaProducer kafkaProducer;

    @Autowired private KafkaService kafkaService;

    @PostMapping("/user/signup")
    public ResponseEntity<ResponseObject> createUser(@RequestBody String userData) {
        User user = new User();
        try {
            JsonNode json = new ObjectMapper().readTree(userData);
            user.setUserName(json.get("name").asText());
            user.setEmailID(json.get("email").asText());
            user.setMobileNo(json.get("contact").asText());
            user.setDob(json.get("DOB").asText());

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        emailID = user.getEmailID();

        //Checking if the user already exists
        Boolean isUserExists = userService.checkEmailExists(emailID);

        if(Boolean.TRUE.equals(isUserExists)){
            ResponseObject responseObject = new ResponseObject(30, new DataObject(null));
        }

        try{
            //Generating OTP & UserID
            String otp = otpMailService.generateOTP();
            String userID = otpMailService.generateUserID();

            //Storing user details into otpMailObject
            OTPMailObject otpMailObject = new OTPMailObject();
            otpMailObject.setOtp(otp);
            otpMailObject.setUserID(userID);
            otpMailObject.setEmailID(emailID);

            try {
                // Serialize the object to a JSON string
                ObjectMapper objectMapper = new ObjectMapper();
                jsonString = objectMapper.writeValueAsString(otpMailObject);
            } catch (Exception e) {
                e.printStackTrace();
            }

            boolean isMailSent = otpMailService.sendOtpMail(jsonString);

            if(isMailSent){
                boolean isDataCached = userDataCachingService.sendOtpToCache(userID, otp, user);
                ResponseObject responseObject = new ResponseObject(200, new DataObject(userID));
                return ResponseEntity.ok(responseObject);

            }
        }catch (Exception e){
            e.printStackTrace();
            ResponseObject responseObject = new ResponseObject(220, new DataObject(null));
            return ResponseEntity.ok(responseObject);
        }

        ResponseObject responseObject = new ResponseObject(0, new DataObject(null));
        return ResponseEntity.ok(responseObject);
    }

    @PostMapping("/user/validateotp")
    public ResponseEntity<ResponseObject> validateOtp(@RequestBody String otp) {

        OtpValObject otpValObject = new OtpValObject();
        int maxAttempts = 3;
        try {
            JsonNode json;
            json = new ObjectMapper().readTree(otp);
            otpValObject.setUserId(json.get("userId").asText());
            otpValObject.setOtp(json.get("OTP").asText());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try{
            OtpValObject otpInCache = userDataCachingService.validateOtpFromCache(otpValObject.getUserId());
            if (!otpInCache.getUserId().equals(otpValObject.getUserId())){
                ResponseObject responseObject = new ResponseObject(1999, new DataObject(null));
                return ResponseEntity.ok(responseObject);
            }

            int attempt = 0;
//            if (!(attempt > maxAttempts)){
                if ((otpInCache.getOtp()).equals(otpValObject.getOtp())){
                    ResponseObject responseObject = new ResponseObject(500, new DataObject(null));
                    return ResponseEntity.ok(responseObject);
                }else{
                    attempt++;
                    ResponseObject responseObject = new ResponseObject(502, new DataObject(null));
                    return ResponseEntity.ok(responseObject);
                }
        }catch(Exception e){
            e.printStackTrace();
        }

        ResponseObject responseObject = new ResponseObject(0, new DataObject(null));
        return ResponseEntity.ok(responseObject);
    }

    @PostMapping("/user/addUserDetails")
    public ResponseEntity<ResponseObject> addUserDetailsInDB(@RequestBody String userDetails){

        User user = new User();

        try{
            JsonNode json = new ObjectMapper().readTree(java.lang.String.valueOf(userDetails));
            user.setUserID(json.get("userId").asText());
            user.setPassword(json.get("password").asText());
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }

        boolean isDataSavedDB = userService.addUserDetailsInDB(user.getUserID(), user.getPassword());
        String emailID = userService.getEmailId(user.getUserID());

        if (!isDataSavedDB){
            return ResponseEntity.ok(new ResponseObject(0, new DataObject(null)));
        }else {
            boolean isCacheClear = userDataCachingService.clearCache(user.getUserID());

            if (!isCacheClear){
                return ResponseEntity.ok(new ResponseObject(0, new DataObject(null)));
            }

            otpMailService.sendWelcomeMail(emailID);
            return ResponseEntity.ok(new ResponseObject(200, new DataObject(null)));
        }
    }

    @PostMapping("/user/login")
    public ResponseEntity<ResponseObject> loginUser(@RequestBody String userDetails){
        LoginObject object = new LoginObject();
        int maxLoginAttempts = 2;
        int loginAttempts = 1;
        try{
            JsonNode json = new ObjectMapper().readTree(userDetails);
            object.setUserid(json.get("userId").asText());
            object.setPassword(json.get("password").asText());
            object.setLoginDevice(json.get("loginDevice").asText());
            //Check if userId exist
            boolean isUserIdExist = userService.checkUserId(object.getUserid());
            String userName = userService.getUserName(object.getUserid());
            if(!isUserIdExist){
                return ResponseEntity.ok(new ResponseObject(201, new DataObject(null, null))); //if userID is invalid
            }else{
                String password = userService.getPassword(object.getUserid());

                if (!(loginAttempts > maxLoginAttempts)) {
                    if (password.equals(object.getPassword())) {
                        //check if session is exist for the user
                        boolean isSessionThere = kafkaService.isSessionExists(object.getUserid(), object.getLoginDevice());
                        if (!isSessionThere) {
                            boolean isLoggedIn = kafkaService.logTheUserIn(object.getUserid(), object.getLoginDevice());
                            if (isLoggedIn) {
                                return ResponseEntity.ok(new ResponseObject(200, new DataObject("Session-"+object.getLoginDevice() , userName))); //if successful login
                            }
                        }
                        if (isSessionThere) {
                            return ResponseEntity.ok(new ResponseObject(204, new DataObject(null,null))); // if active session exists on this device
                        }
                    } else {
//                        loginAttempts++;
                        return ResponseEntity.ok(new ResponseObject(202, new DataObject(null, null))); // if password is not valid
                    }
                }
                else{
                    return ResponseEntity.ok(new ResponseObject(205, new DataObject(null,null))); // if Invalid credentials 3 consecutive times.
                }
            }
        }catch(JsonProcessingException e){
            throw  new RuntimeException(e);
        }
        ResponseObject responseData = new ResponseObject(0, new DataObject(null,null)); //unexpected error
        return ResponseEntity.ok(responseData);
    }

    @PostMapping("/user/forgotPassword")
    public ResponseEntity<ResponseObject> forgotPassword(@RequestBody String email) {

        User user = new User();
        try {
            JsonNode json;
            json = new ObjectMapper().readTree(email);
            user.setEmailID(json.get("email").asText());

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        emailID = user.getEmailID();

        //Checking if the user already exists
        Boolean isUserExists = userService.checkEmailExists(emailID);

        if(Boolean.TRUE.equals(isUserExists)){
            String otp = otpMailService.generateOTP();
            //Storing user details into otpMailObject
            OTPMailObject otpMailObject = new OTPMailObject();
            otpMailObject.setOtp(otp);
            otpMailObject.setEmailID(emailID);

            ObjectMapper objectMapper = new ObjectMapper();
            try {
                jsonString = objectMapper.writeValueAsString(otpMailObject);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            boolean isMailSent = otpMailService.sendOtpOnForgotPassword(jsonString);

            if(isMailSent){
                boolean isDataCached = userDataCachingService.sendForgotPassOtpToCache(emailID, otp);
            }
        }else{
            ResponseObject responseObject = new ResponseObject(199, new DataObject(null));
            return ResponseEntity.ok(responseObject);
        }
        ResponseObject responseObject = new ResponseObject(200, new DataObject(null));
        return ResponseEntity.ok(responseObject);
    }

    @PostMapping("/user/validateOTPForForgotPassword")
    public ResponseEntity<ResponseObject> validateOtpForForgotPassword(@RequestBody String forgotPasswordOtp) {

        OtpValObject otpValObject = new OtpValObject();
        try {
            JsonNode json;
            json = new ObjectMapper().readTree(forgotPasswordOtp);
            otpValObject.setEmailid(json.get("email").asText());
            otpValObject.setOtp(json.get("OTP").asText());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try{
            OtpValObject otpInCache = userDataCachingService.getForgotPassOtpFromCache(otpValObject.getEmailid());

                if (otpValObject.getOtp().equals(otpValObject.getOtp())){
                    ResponseObject responseObject = new ResponseObject(200, new DataObject(null));
                    return ResponseEntity.ok(responseObject);
                }else{
                    ResponseObject responseObject = new ResponseObject(199, new DataObject(null));
                    return ResponseEntity.ok(responseObject);
                }
        }catch(Exception e){
            e.printStackTrace();
        }

        ResponseObject responseObject = new ResponseObject(0, new DataObject(null));
        return ResponseEntity.ok(responseObject);
    }

    @PostMapping("/user/changePassword")
    public ResponseEntity<ResponseObject> changePassword(@RequestBody String userDetails){
        User user = new User();
        try{
            JsonNode json = new ObjectMapper().readTree(java.lang.String.valueOf(userDetails));
            user.setEmailID(json.get("email").asText());
            user.setPassword(json.get("password").asText());
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }

        boolean isPasswordReset = userService.updatePasswordInDB(user.getEmailID(), user.getPassword());

        if (!isPasswordReset){
            return ResponseEntity.ok(new ResponseObject(199, new DataObject(null)));
        }else {
            boolean isCacheClear = userDataCachingService.clearCacheforForgotPassword(user.getEmailID());

            return ResponseEntity.ok(new ResponseObject(200, new DataObject(null)));
        }
    }

    @PostMapping("/user/logout")
    public ResponseEntity<ResponseObject> logoutUser(@RequestBody String userDetails){
        LoginObject object = new LoginObject();

        try{
            JsonNode json = new ObjectMapper().readTree(userDetails);
            object.setUserid(json.get("userId").asText());
            object.setPassword(json.get("sessionId").asText());

            boolean isUserIdExist = userService.checkUserId(object.getUserid());
            String userName = userService.getUserName(object.getUserid());

            boolean isSessionThere = kafkaService.isSessionExists(object.getUserid(), object.getLoginDevice());
            if (isSessionThere) {
                boolean isLoggedIn = kafkaService.logTheUserOut(object.getUserid(), object.getLoginDevice());
                if (isLoggedIn) {
                     return ResponseEntity.ok(new ResponseObject(200, new DataObject("Session-" + object.getLoginDevice(), userName))); //if successful login
                }
            }
        }catch(JsonProcessingException e){
            throw  new RuntimeException(e);
        }
        ResponseObject responseData = new ResponseObject(0, new DataObject(null,null)); //unexpected error
        return ResponseEntity.ok(responseData);
    }

}
