package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Maps HTTP GET requests to http://localhost:8080/greet
    @GetMapping("/greet")
    public String greetUser(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + sssaa + "! Welcome to your first Java Web App.";
    }
}
