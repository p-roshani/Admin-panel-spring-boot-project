package com.oscProject.services;

import com.oscProject.*;
import com.oscProject.entities.OtpValObject;
import com.oscProject.entities.User;
import com.oscProject.repositories.UserRepository;
import jdk.swing.interop.SwingInterOpUtils;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataCachingService {

    @GrpcClient("cachingService")
    private CacheServiceGrpc.CacheServiceBlockingStub cstub;

    @Autowired
    private UserRepository userRepository;
    public boolean sendOtpToCache(String userID, String otp, User user) {

//        CacheUserDetailsRequest request = CacheUserDetailsRequest.newBuilder().setUserId(userID).setOtp(otp).setUserName(user.getUserName()).setEmailId(user.getEmailID()).setDob(user.getDob()).setMobileNo(user.getMobileNo()).build();
         CacheUserDetailsRequest request = CacheUserDetailsRequest.newBuilder().setOtp(otp).setUserId(userID).setUserName(user.getUserName()).setEmailId(user.getEmailID()).setDob(user.getDob()).setMobileNo(user.getMobileNo()).build();

        CacheUserDetailsResponse response = cstub.storeOtpUserIdInCache(request);

        return response.getIsSave();
    }

    public OtpValObject validateOtpFromCache(String userId) {
        GetOtpRequest request = GetOtpRequest.newBuilder().setUserId(userId).build();
        GetOtpResponse response = cstub.getOtp(request);

        OtpValObject otpValObject = new OtpValObject();
        otpValObject.setUserId(response.getUserId());
        otpValObject.setOtp(response.getOtp());
        return otpValObject;
    }

    public boolean clearCache(String userId){
        GetUserIdRequest request = GetUserIdRequest.newBuilder().setUserId(userId).build();
        GetCacheClearResponse response = cstub.clearCache(request);
        return response.getIsCacheClear();
    }

    public boolean sendForgotPassOtpToCache(String emailId, String otp){
//        CacheUserDetailsRequest request = CacheUserDetailsRequest.newBuilder().setOtp(otp).setUserId(userID).setUserName(user.getUserName()).setEmailId(user.getEmailID()).setDob(user.getDob()).setMobileNo(user.getMobileNo()).build();

        CacheOtpForgotPassRequest request = CacheOtpForgotPassRequest.newBuilder().setEmailId(emailId).setOtp(otp).build();
        CacheUserDetailsResponse response = cstub.storeOtpInCacheForgotPass(request);
        return response.getIsSave();
    }

    public OtpValObject getForgotPassOtpFromCache(String emailId) {

        System.out.println("getForgotPassOtpFromCache emailId: "+emailId);
        GetOtpForgotPassRequest request = GetOtpForgotPassRequest.newBuilder().setEmailId(emailId).build();
        GetOtpForgotPassResponse response = cstub.getOtpForgotPass(request);

        OtpValObject otpValObject = new OtpValObject();
        otpValObject.setEmailid(response.getEmailId());
        otpValObject.setOtp(response.getOtp());
        return otpValObject;
    }

    public boolean clearCacheforForgotPassword(String emailID) {
        GetPasswordRequest request = GetPasswordRequest.newBuilder().setEmailId(emailID).build();
        GetCacheClearResponse response = cstub.clearCacheForForgotPassword(request);
        return response.getIsCacheClear();
    }
}
