package com.likelion.ktc.lab23mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello from MVC Controller!");
        return "hello"; // Will render src/main/resources/templates/hello.html
    }
} 