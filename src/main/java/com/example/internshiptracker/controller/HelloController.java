
package com.example.internshiptracker.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Welcome to the Internship Application Tracker.";
    }

    @GetMapping("/application")
    public Map<String, String> getApplication() {
        return Map.of(
            "company", "Google",
            "role", "Software Engineering Intern",
            "status", "Applied"
        );
    }
}
