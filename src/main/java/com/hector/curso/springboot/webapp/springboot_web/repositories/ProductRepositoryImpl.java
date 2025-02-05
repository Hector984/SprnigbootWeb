package com.hector.curso.springboot.webapp.springboot_web.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;

// El repositorio es la capa de acceso a datos
// Indica que este es el repositorio principal
@Primary
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    public ProductRepositoryImpl() {
        this.products = Arrays.asList(new Product(1L, "Memoria 12 GB", 300L), 
        new Product(2L, "Disco Duro 1 TB", 100L),
        new Product(3L, "Monitor 24", 150L), 
        new Product(4L, "Teclado", 20L), 
        new Product(5L, "Ratón", 10L));
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override 
    public Product getProductById(Long id) {
        // Optional evita la excepcion null pointer exception
        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
