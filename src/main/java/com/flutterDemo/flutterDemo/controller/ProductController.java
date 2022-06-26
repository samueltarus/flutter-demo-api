package com.flutterDemo.flutterDemo.controller;


import com.flutterDemo.flutterDemo.model.Product;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public interface ProductController {
    @GetMapping("/list")
    public  Response listProducts() ;

    @PutMapping("/{id}")
    public Response
    updateProduct(@RequestBody Product product,
                  @PathVariable("id") Long productId);

    // Delete operation
    @DeleteMapping("/{id}")
    public  Response deleteProductById(@PathVariable("id")
                                    Long productId);
}
