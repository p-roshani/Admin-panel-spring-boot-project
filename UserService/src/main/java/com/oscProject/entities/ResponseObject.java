package com.oscProject.entities;

public class ResponseObject {
    private int code;
    private DataObject dataObject;

    public ResponseObject(int code, DataObject dataObject) {
        this.code = code;
        this.dataObject = dataObject;
    }

    public ResponseObject(DataObject dataObject, int code) {
        this.code = code;
        this.dataObject = dataObject;
    }

    public ResponseObject(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataObject getDataObject() {
        return dataObject;
    }

    public void setDataObject(DataObject dataObject) {
        this.dataObject = dataObject;
    }
}
