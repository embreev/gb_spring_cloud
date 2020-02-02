package controllers;

import entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/products")
public class ProductController {
    private services.ProductService productService;

    @Autowired
    public ProductController(services.ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/edit/{id}")
    public String editProductForm(Model model, @PathVariable Long id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "edit_product";
    }

    @PostMapping("/edit")
    public String saveProduct(@ModelAttribute(name = "product") Product product) {
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String showProduct(Model model, Principal principal, @PathVariable Long id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "product_page";
    }
}
