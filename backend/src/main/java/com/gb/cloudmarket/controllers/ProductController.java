package com.gb.cloudmarket.controllers;

import com.gb.cloudmarket.entites.Product;
import com.gb.cloudmarket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(com.gb.cloudmarket.services.ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public List<Product> showProducts() {
        return productService.findAll();
    }

    @RequestMapping("/{id}")
    public Product showProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        return product;
    }
}
