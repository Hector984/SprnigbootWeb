package com.hector.curso.springboot.webapp.springboot_web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;
import com.hector.curso.springboot.webapp.springboot_web.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class SomeController {

    @Autowired
    private ProductService  productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
