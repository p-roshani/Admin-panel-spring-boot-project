package com.oscProject.services;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.oscProject.*;
import com.oscProject.entities.UserDetails;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.ArrayList;
import java.util.List;

@GrpcService
public class CacheService extends CacheServiceGrpc.CacheServiceImplBase {


    @Override
    public void storeOtpUserIdInCache(CacheUserDetailsRequest request, StreamObserver<CacheUserDetailsResponse> responseObserver) {

        String userId = request.getUserId();
        String otp = request.getOtp();
        String userName = request.getUserName();
        String emailId = request.getEmailId();
        String mobNo = request.getMobileNo();
        String dob = request.getDob();

        UserDetails user = new UserDetails(userId, userName, emailId, mobNo, dob, otp);

        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();
        IMap<String, UserDetails> map = hazelcastInstance.getMap("userOtp");
        map.put(userId, user);

        /*List <String> userData = new ArrayList<>();
        userData.add(userId);
        userData.add(otp);
        userData.add(userName);
        userData.add(emailId);
        userData.add(mobNo);
        userData.add(dob);

        HazelcastInstance hazelcastInstanceList = HazelCastSingleton.getHazelcastInstance();
        IMap<String, List<String>> iMap = hazelcastInstance.getMap("userOtpDetails");
        iMap.put(userId, userData);*/

        CacheUserDetailsResponse response;
        response = CacheUserDetailsResponse.newBuilder().setIsSave(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void clearCacheForForgotPassword(GetPasswordRequest request, StreamObserver<GetCacheClearResponse> responseObserver) {
//        super.clearCacheForForgotPassword(request, responseObserver);
        String emailId = request.getEmailId();
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, UserDetails> map = hazelcastInstance.getMap("otpForgotPassword");
        boolean isUserIdExists = map.containsKey(emailId);
        GetCacheClearResponse response;

        if (isUserIdExists){
            map.remove(emailId);
            response = GetCacheClearResponse.newBuilder().setIsCacheClear(true).build();
        }else {
            response = GetCacheClearResponse.newBuilder().setIsCacheClear(false).build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void clearCache(GetUserIdRequest request, StreamObserver<GetCacheClearResponse> responseObserver) {

        String userId = request.getUserId();
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, UserDetails> map = hazelcastInstance.getMap("userOtp");
        boolean isUserIdExists = map.containsKey(userId);
        GetCacheClearResponse response;

        if (isUserIdExists){
            map.remove(userId);
            response = GetCacheClearResponse.newBuilder().setIsCacheClear(true).build();
        }else {
            response = GetCacheClearResponse.newBuilder().setIsCacheClear(false).build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void getOtp(GetOtpRequest request, StreamObserver<GetOtpResponse> responseObserver) {

//        super.getOtp(request, responseObserver);
        String userId = request.getUserId();
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, UserDetails> map = hazelcastInstance.getMap("userOtp");
        UserDetails data = (map.get(userId));
        String otp = data.getOtp();
        String userId1 = data.getUserId();
        GetOtpResponse response = GetOtpResponse.newBuilder().setOtp(otp).setUserId(userId1).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserDetails(GetUserDetailsRequest request, StreamObserver<GetUserDetailsResponse> responseObserver) {
//        super.getUserDetails(request, responseObserver);

        String userId = request.getUserId();
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, UserDetails> map = hazelcastInstance.getMap("userOtp");
        UserDetails data = map.get(userId);

        GetUserDetailsResponse response = GetUserDetailsResponse.newBuilder().setUserId(data.getUserId()).setUserName(data.getUserName()).setEmailId(data.getEmailId()).setMobNo(data.getMobNo()).setDob(data.getDob()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOtpForgotPass(GetOtpForgotPassRequest request, StreamObserver<GetOtpForgotPassResponse> responseObserver) {
        String emailId = request.getEmailId();
        System.out.println("emailId in getOtp: "+emailId);
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, String> map = hazelcastInstance.getMap("otpForgotPassword");
//        UserDetails data = (map.get(emailId));
        String otp = map.get(emailId);
//        String otp = data.getOtp();
//        String userId1 = data.getUserId();
        GetOtpForgotPassResponse response = GetOtpForgotPassResponse.newBuilder().setEmailId(emailId).setOtp(otp).build();
//        GetOtpResponse response = GetOtpResponse.newBuilder().setOtp(otp).setUserId(userId1).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

//        super.getOtpForgotPass(request, responseObserver);
    }


    @Override
    public void getUserDetailsToChangePassword(GetUserDetToChangePasswordRequest request, StreamObserver<GetUserDetailsResponse> responseObserver) {
//        super.getUserDetailsToChangePassword(request, responseObserver);


        String emailId = request.getEmailId();
        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();

        IMap<String, UserDetails> map = hazelcastInstance.getMap("otpForgotPassword");
        UserDetails data = map.get(emailId);

        GetUserDetailsResponse response = GetUserDetailsResponse.newBuilder().setUserId(data.getUserId()).setUserName(data.getUserName()).setEmailId(data.getEmailId()).setMobNo(data.getMobNo()).setDob(data.getDob()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void storeOtpInCacheForgotPass(CacheOtpForgotPassRequest request, StreamObserver<CacheUserDetailsResponse> responseObserver) {

        String otp = request.getOtp();
        String emailId = request.getEmailId();

//        UserDetails user = new UserDetails(userId, userName, emailId, mobNo, dob, otp);
//        UserDetails user = new UserDetails(otp);

        HazelcastInstance hazelcastInstance = HazelCastSingleton.getHazelcastInstance();
        IMap<String, String> map = hazelcastInstance.getMap("otpForgotPassword");
        map.put(emailId, otp);

        /*List <String> userData = new ArrayList<>();
        userData.add(userId);
        userData.add(otp);
        userData.add(userName);
        userData.add(emailId);
        userData.add(mobNo);
        userData.add(dob);

        HazelcastInstance hazelcastInstanceList = HazelCastSingleton.getHazelcastInstance();
        IMap<String, List<String>> iMap = hazelcastInstance.getMap("userOtpDetails");
        iMap.put(userId, userData);*/

        CacheUserDetailsResponse response;
        response = CacheUserDetailsResponse.newBuilder().setIsSave(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

//        super.storeOtpInCacheForgotPass(request, responseObserver);
    }
}
