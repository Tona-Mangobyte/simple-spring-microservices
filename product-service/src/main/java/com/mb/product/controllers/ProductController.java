package com.mb.product.controllers;

import com.mb.product.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private OrderService orderService;
    public ProductController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public String index() {
        return "Get All Products";
    }

    @GetMapping("/invoices")
    public String getInvoices() {
        return this.orderService.getInvoices();
    }

    @GetMapping("{id}")
    public String getById(@PathVariable("id") String id) {
        return "Get Product By Id: "+ id;
    }
}
