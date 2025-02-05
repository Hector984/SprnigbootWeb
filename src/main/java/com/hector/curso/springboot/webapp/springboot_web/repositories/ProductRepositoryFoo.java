package com.hector.curso.springboot.webapp.springboot_web.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;

@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        return Collections.singletonList(new Product(1L, "Memoria 12 GB", 300L));
    }

    @Override
    public Product getProductById(Long id) {
        return new Product(1L, "Memoria 12 GB", 300L);
    }

}
