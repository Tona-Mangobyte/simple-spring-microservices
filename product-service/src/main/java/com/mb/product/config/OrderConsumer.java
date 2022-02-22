package com.mb.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class OrderConsumer {
    // autowire DisocveryClient
    @Autowired
    private DiscoveryClient client;

    public String getOrderInfo() {
        // get ServiceInstance list using serviceId
        List<ServiceInstance> siList = client.getInstances("ORDER-SERVICE");
        System.out.println(siList.get(0));
        // read manually one instance from index#0
        ServiceInstance si = siList.get(0);

        // read URI and Add path that returns url
        String url = si.getUri() +"/orders/getData";

        // create object for RestTemplate
        RestTemplate rt = new RestTemplate();

        // make HTTP call and get Reponse data
        String response = rt.getForObject(url, String.class);

        // return response back to Consumer
        return response;
    }
}
