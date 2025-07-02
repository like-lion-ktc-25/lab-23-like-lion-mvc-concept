package com.likelion.ktc.lab23mvc.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to Like Lion MVC.";
    }
} 