package com.oscProject.entities;
public class OTPMailObject {

    private String userID;
    private String emailID;
    private String otp;

    public OTPMailObject(String userID, String emailID, String otp) {
        this.userID = userID;
        this.emailID = emailID;
        this.otp = otp;
    }

    public OTPMailObject(String userID, String otp) {
        this.userID = userID;
        this.otp = otp;
    }

    public OTPMailObject() {
        super();
    }
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

}
