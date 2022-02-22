package com.mb.product.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service")
public interface OrderService {
    @GetMapping("/orders")
    String getInvoices();

    @GetMapping("/orders/{invoiceId}")
    String getInvoiceById(String invoiceId);
}
