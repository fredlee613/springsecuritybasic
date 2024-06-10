package com.fredlee613.springsecuritybasic.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Security Application with our Security";
    }
}
