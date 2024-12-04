package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public String getGreeting(){
        return "this is a greeting";
    }
}
