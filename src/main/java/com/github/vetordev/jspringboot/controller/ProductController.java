package com.github.vetordev.jspringboot.controller;

import com.github.vetordev.jspringboot.model.entity.Product;
import com.github.vetordev.jspringboot.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product newProduct(Product product) {
        productRepository.save(product);

        return product;
    }

    @GetMapping
    public Iterable<Product> listProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @PutMapping
    public Product updateProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
