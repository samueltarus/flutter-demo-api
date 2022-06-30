package com.flutterDemo.flutterDemo.controller;


import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.service.impl.ProductServiceImplementation;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@Log
public class ProductController {

    private final ProductServiceImplementation productService;

    @GetMapping("/list")
    public List<Product> listProducts() {
        log.info("Calling list of products....");
        return productService.listProducts();
    }


    @PutMapping("/{id}")
    public Product
    updateProduct(@RequestBody Product product,
                  @PathVariable("id") Long productId) {
        return   productService.updateProduct(
                product, productId);

    }

    // Delete operation
    @DeleteMapping("/{id}")
    public Product deleteProductById(@PathVariable("id")
                                      Long productId) {
          productService.deleteProductById(
                productId);

        return null;
    }
}
