package com.mb.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class SimpleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Microservice";
    }

    @GetMapping("/getData")
    public String getCartData() {
        return "Returning data from ORDER-SERVICE";
    }
}
