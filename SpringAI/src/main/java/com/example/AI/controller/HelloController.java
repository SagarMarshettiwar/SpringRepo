package com.example.AI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @PostMapping("/submit")
	public String handleSubmit(@RequestBody String data) {
		// Process the submitted data
		return "Data received: " + data;
			
    }
    
}

