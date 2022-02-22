package com.mb.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DiscoveryApplication.class, args);
        new SpringApplicationBuilder(DiscoveryApplication.class).run(args);
    }

}
