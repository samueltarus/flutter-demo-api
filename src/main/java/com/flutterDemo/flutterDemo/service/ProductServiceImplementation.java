package com.flutterDemo.flutterDemo.service;

import com.flutterDemo.flutterDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService{

    @Autowired
    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void listProducts() {
        productRepository.findAll();
    }
}
