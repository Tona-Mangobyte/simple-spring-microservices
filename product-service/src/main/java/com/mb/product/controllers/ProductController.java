package com.mb.product.controllers;

import com.mb.product.config.OrderConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private OrderConsumer consumer;

    @GetMapping
    public String index() {
        return "Get All Products";
    }

    @GetMapping("/invoices")
    public String getInvoices() {
        return "FROM PAYMENT-SERVICE : " + consumer.getOrderInfo();
    }
}
