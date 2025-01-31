package com.hector.curso.springboot.webapp.springboot_web.services;

import java.util.List;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Long id);
}
