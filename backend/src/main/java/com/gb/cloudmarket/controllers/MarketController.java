package com.gb.cloudmarket.controllers;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
    private EurekaClient eurekaClient;

    @Autowired
    @Lazy
    public MarketController(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        return (String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName()));
    }

}