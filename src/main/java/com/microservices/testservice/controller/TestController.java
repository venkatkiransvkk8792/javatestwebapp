package com.microservices.testservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class TestController {

    @GetMapping
    @RequestMapping("/path")
    public void testHealth() {
        System.out.println("test get call");
    }
}
