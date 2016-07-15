package com.kaishengit.dto;

public class FlashMassage {

    public static final String STATE_SUCCESS="success";
    public static final String STATE_ERROR="error";


    private  String state;
    private String message;


    public FlashMassage(String message){
        this.state=STATE_SUCCESS;
        this.message=message;
    }

    public FlashMassage(String state,String message){
        this.state=state;
        this.message=message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}