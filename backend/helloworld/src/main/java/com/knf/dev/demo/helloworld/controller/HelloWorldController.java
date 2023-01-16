package com.knf.dev.demo.helloworld.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/api/v1/")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}