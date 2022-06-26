package com.flutterDemo.flutterDemo.service;

import com.flutterDemo.flutterDemo.model.Product;

import java.util.List;

public interface ProductService {

    // Read operation
    List<Product> listProducts();

    // Save operation
    Product saveProduct(Product product);

    // Update operation
    Product updateProduct(Product product,
                                Long productId);

    // Delete operation
    void deleteProductById(Long productId);
}
