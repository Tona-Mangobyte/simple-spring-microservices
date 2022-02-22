package com.mb.order.controllers;

import com.mb.order.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private ProductService productService;
    public OrderController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getInvoices() {
        return "Get All Invoices";
    }

    @GetMapping("{id}")
    public String getInvoiceById(@PathVariable("id") String id) {
        return "Get Invoice By Id: "+ id;
    }

    @GetMapping("{id}/products")
    public String getInvoiceProducts(@PathVariable("id") String id) {
        return this.productService.getProducts();
    }
}
