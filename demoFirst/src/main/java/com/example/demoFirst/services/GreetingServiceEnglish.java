package com.example.demoFirst.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello everyone";
    }
    
}
