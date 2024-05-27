package com.oscProject.entities;

import java.io.Serializable;

public class UserDetails implements Serializable {
    String userId;
    String userName;
    String emailId;
    String mobNo;
    String dob;
    String otp;

    public UserDetails(String userId, String userName, String emailId, String mobNo, String dob, String otp) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.mobNo = mobNo;
        this.dob = dob;
        this.otp = otp;
    }

    public UserDetails(String emailId, String otp) {
        this.emailId = emailId;
        this.otp = otp;
    }

    public UserDetails(String otp) {
        this.otp = otp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", dob='" + dob + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
