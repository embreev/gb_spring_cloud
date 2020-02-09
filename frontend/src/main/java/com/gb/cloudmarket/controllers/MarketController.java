package com.gb.cloudmarket.controllers;

//import com.gb.cloudmarket.entites.Product;
import com.gb.cloudmarket.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MarketController {
    private RestTemplate restTemplate;

    @Autowired
    public MarketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/")
    public String index(Model model) {
        ResponseEntity rest = restTemplate.exchange("http://localhost:8189/backend/products/", HttpMethod.GET, null, List.class);
        List<ProductDTO> products = (List<ProductDTO>)rest.getBody();
        model.addAttribute("products", products);
        return "index";
    }
}