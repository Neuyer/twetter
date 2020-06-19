package com.twetter.messages;

public class MessageDeliverer {

    private String message;

    public MessageDeliverer() {
    }

    public MessageDeliverer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
