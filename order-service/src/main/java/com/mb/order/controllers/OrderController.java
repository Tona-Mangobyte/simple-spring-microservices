package com.mb.order.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getInvoices() {
        return "Get All Invoices";
    }

    @GetMapping("/getData")
    public String getCartData() {
        return "Returning data from ORDER-SERVICE";
    }
}
