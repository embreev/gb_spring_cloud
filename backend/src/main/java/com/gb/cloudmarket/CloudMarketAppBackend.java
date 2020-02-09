package com.gb.cloudmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudMarketAppBackend {
    public static void main(String[] args) {
        SpringApplication.run(CloudMarketAppBackend.class, args);
    }
}
