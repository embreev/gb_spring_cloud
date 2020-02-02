package controllers;

import services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@Controller
public class MarketController {
    private ProductService productService;

    public MarketController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        return "index";
    }

}