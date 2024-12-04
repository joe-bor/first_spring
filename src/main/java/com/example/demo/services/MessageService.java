package com.example.demo.services;

import org.springframework.stereotype.Service;

public class MessageService {
    private String message;

    public MessageService(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }
}
