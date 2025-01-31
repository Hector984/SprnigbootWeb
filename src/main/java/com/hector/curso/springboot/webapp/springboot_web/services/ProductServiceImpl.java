package com.hector.curso.springboot.webapp.springboot_web.services;

import java.util.List;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;
import com.hector.curso.springboot.webapp.springboot_web.repositories.ProductRepositoryImpl;

// La clase service accesa a los datos mediante el repositorio y trabaja cono ellos
public class ProductServiceImpl implements ProductService {

    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.21d;
            // p.setPrice(priceImp.longValue());
            Product newProduct = (Product)p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).toList();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

}
