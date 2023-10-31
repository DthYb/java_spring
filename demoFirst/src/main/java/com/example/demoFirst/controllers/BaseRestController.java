package com.example.demoFirst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoFirst.services.GreetingService;

@RestController
public class BaseRestController {

    // injection de dépendance par constructeur
    private final GreetingService greetingService;

    @Autowired
    public BaseRestController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/hello-service")
    public String sayHello(){
        System.out.println(greetingService.sayHello());
        return "coucou";
    }
    
}
