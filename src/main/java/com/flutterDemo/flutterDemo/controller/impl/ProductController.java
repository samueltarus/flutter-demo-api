package com.flutterDemo.flutterDemo.controller.impl;


import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.model.Response;
import com.flutterDemo.flutterDemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@Log
public class ProductController {

    private final ProductService productService;


    @GetMapping("/list")
    public ResponseEntity<Response> listProducts() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDate.now())
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Products retrieved successfully")
                        .data(Map.of("products", productService.listProducts()))
                        .build());
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
