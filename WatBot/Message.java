package com.example.stephen.WatBot;



import java.io.Serializable;

public class Message implements Serializable {
    String id, message;


    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

