package com.oscProject.entities;

public class DataObject {
    private String userId;
    private String sessionId;

    public DataObject(String userId) {
        this.userId = userId;
    }

    public DataObject(String sessionId, String userId ) {
        this.userId = userId;
        this.sessionId = sessionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
