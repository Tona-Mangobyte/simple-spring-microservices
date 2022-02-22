package com.mb.order.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductService {
    @GetMapping("/products")
    String getProducts();
}
