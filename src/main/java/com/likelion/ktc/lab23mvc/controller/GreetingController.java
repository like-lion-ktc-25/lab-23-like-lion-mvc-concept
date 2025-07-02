package com.likelion.ktc.lab23mvc.controller;

import com.likelion.ktc.lab23mvc.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name, Model model) {
        String greeting = greetingService.getGreeting(name);
        model.addAttribute("greeting", greeting);
        return "greeting";
    }
} 