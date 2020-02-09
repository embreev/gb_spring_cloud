package com.gb.cloudmarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.gb.cloudmarket.services.CategoryService;
import com.gb.cloudmarket.services.ProductService;
import com.gb.cloudmarket.services.UserService;
import java.util.Map;

@Controller
public class MarketController {
    private ProductService productService;
    private CategoryService categoryService;
    private UserService userService;

    public MarketController(ProductService productService, CategoryService categoryService, UserService userService) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.userService = userService;
    }


    @GetMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        return "index";
    }
}