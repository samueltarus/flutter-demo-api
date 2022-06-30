package com.flutterDemo.flutterDemo.controller.impl;


import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.service.impl.ProductServiceImplementation;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

/*
    public Response
    updateProduct(@RequestBody Product product,
                  @PathVariable("id") Long productId) {
        productService.updateProduct(
                product, productId);
        return buildResponse(
                true,
                "Updated Successfully",
                null
        );
    }

    // Delete operation
    public Response deleteProductById(@PathVariable("id")
                                      Long productId) {
        productService.deleteProductById(
                productId);

        return buildResponse(
                true,
                "Deleted Successfully",
                null
        );
    }*/
}
