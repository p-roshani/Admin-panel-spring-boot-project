package com.oscProject.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String userid;
    private String userName;
    private String email_id;
    private String dob;
    private String mobileNo;
    private String password;

    public User() {
    }

    public User(String userName, String emailID, String dob, String mobileNo, String password) {
        this.userName = userName;
        this.email_id = emailID;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.password = password;
    }

    public String getUserID() {
        return userid;
    }

    public void setUserID(String userid) {
        this.userid = userid;
    }

    public String getEmailID() {
        return email_id;
    }

    public void setEmailID(String email_id) {
        this.email_id = email_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
