package com.hector.curso.springboot.webapp.springboot_web.repositories;

import java.util.List;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;

public interface ProductRepository {

    List<Product> getProducts();
    Product getProductById(Long id);
}
