package com.practice.appone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/greet")
    public String greetings() {
        return "Hello there";
    }
}
