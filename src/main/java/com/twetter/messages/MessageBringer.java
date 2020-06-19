package com.twetter.messages;

public class MessageBringer {

    private String message;

    public MessageBringer() {
    }

    public MessageBringer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
