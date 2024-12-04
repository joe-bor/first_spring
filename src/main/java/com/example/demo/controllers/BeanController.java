package com.example.demo.controllers;

import com.example.demo.AppConfig;
import com.example.demo.services.GreetingService;
import com.example.demo.services.MessageService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BeanController {

    private GreetingService greetingService;
    private MessageService messageService;

    @GetMapping("message")
    public String getMessage(){
        return this.messageService.getMessage();
    }

    @GetMapping("greeting")
    public String getGreeting(){
        return this.greetingService.getGreeting();
    }


}
