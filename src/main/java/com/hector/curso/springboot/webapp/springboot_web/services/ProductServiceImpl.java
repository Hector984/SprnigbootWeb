package com.hector.curso.springboot.webapp.springboot_web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hector.curso.springboot.webapp.springboot_web.models.Product;
import com.hector.curso.springboot.webapp.springboot_web.repositories.ProductRepository;

// La clase service accesa a los datos mediante el repositorio y trabaja cono ellos
@Service
public class ProductServiceImpl implements ProductService {
    
    @Value("${config.tax}")
    private Double tax;

    @Autowired
    // Usando Qualifier podemos seleccionar que bean queremos inyectar en caso de que haya mas de uno
    @Qualifier("productRepositoryImpl")
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts().stream().map(p -> {
            Double priceTax = p.getPrice() * this.tax;
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
