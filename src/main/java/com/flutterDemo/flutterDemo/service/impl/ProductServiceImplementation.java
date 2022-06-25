package com.flutterDemo.flutterDemo.service.impl;

import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.repository.ProductRepository;
import com.flutterDemo.flutterDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listProducts() {
       return productRepository.findAll();
    }
}
