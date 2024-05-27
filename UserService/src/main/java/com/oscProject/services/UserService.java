/*
package com.oscProject.services;

import com.oscProject.entities.User;
import com.oscProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Boolean checkEmailExists(String emailID) {
        System.out.println("checkEmailExists");
        boolean response;
        Optional<User> emailExist = userRepository.existsByEmail(emailID);

        if (emailExist.isEmpty()){
            response = false;
            System.out.println("response: " +response);
        }else{
            response = true;
            System.out.println("response1: " +response);
        }

        return response;
    }
}
*/

package com.oscProject.services;

import com.oscProject.CacheServiceGrpc;
import com.oscProject.GetUserDetToChangePasswordRequest;
import com.oscProject.GetUserDetailsRequest;
import com.oscProject.GetUserDetailsResponse;
import com.oscProject.entities.User;
import com.oscProject.repositories.UserRepository;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @GrpcClient("cachingService")
    private CacheServiceGrpc.CacheServiceBlockingStub cstub;

    @Autowired
    private UserRepository userRepository;

    public boolean checkEmailExists(String emailID) {
        return userRepository.existsByEmail(emailID).isPresent();
    }

    public boolean addUserDetailsInDB(String userID, String password) {
        GetUserDetailsRequest request = GetUserDetailsRequest.newBuilder().setUserId(userID).build();
        GetUserDetailsResponse response = cstub.getUserDetails(request);
        User user = new User();
//        user.setUserID(response.getUserId());
        user.setUserID(userID);
        user.setUserName(response.getUserName());
        user.setEmailID(response.getEmailId());
        user.setPassword(password);
        user.setDob(response.getDob());
        user.setMobileNo(response.getMobNo());
        userRepository.save(user);
        return true;
    }


    public String getEmailId(String userID) {
        Optional<String> emailOptional = userRepository.findEmailIdByUserId(userID);
        String emailId = "";

        if (emailOptional.isPresent()){
            emailId = emailOptional.get();
        }
        return emailId;
    }

    public boolean updatePasswordInDB(String email, String password) {
        GetUserDetToChangePasswordRequest request = GetUserDetToChangePasswordRequest.newBuilder().setEmailId(email).build();
        GetUserDetailsResponse response = cstub.getUserDetailsToChangePassword(request);

        /*Optional<String> emailOptional = userRepository.findDetailsByEmailId(email);
        User user = new User();

        if (emailOptional.isPresent()){
            user = emailOptional.get();
        }*/

        /*user.setUserID(response.getUserId());
        user.setUserID(response.getUserId());
        user.setUserName(response.getUserName());
        user.setEmailID(email);
        user.setPassword(password);
        user.setDob(response.getDob());
        user.setMobileNo(response.getMobNo());
        userRepository.save(user);*/

        Optional<User> optionalUser = userRepository.findByEmailId(email);

        // If user exists, update the password and save
        optionalUser.ifPresent(user -> {
            user.setPassword(password);
            userRepository.save(user);
        });

        return true;
    }

    public boolean checkUserId(String userid) {
        return userRepository.existsByID(userid).isPresent();
    }

    public String getUserName(String userid) {
        Optional<String> usernameOpt = userRepository.fetchUsername(userid);
        String username = "";

        if (usernameOpt.isPresent()){
            username = usernameOpt.get();
        }
        return username;
    }

    public String getPassword(String userid) {
        Optional<String> passwordOpt = userRepository.fetchPassword(userid);
        String password = "";

        if (passwordOpt.isPresent()){
            password = passwordOpt.get();
        }
        return password;

    }
}
