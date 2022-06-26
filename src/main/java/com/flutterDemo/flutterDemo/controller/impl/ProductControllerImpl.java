package com.flutterDemo.flutterDemo.controller.impl;


import com.flutterDemo.flutterDemo.controller.BaseController;
import com.flutterDemo.flutterDemo.controller.ProductController;
import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

public class ProductControllerImpl extends BaseController implements ProductController {

    @Autowired
    private final ProductService productService;

    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    public Response listProducts() {

        return buildResponse(
                true,
                "Success",
                productService.listProducts()
        );
    }

    public Response
    updateProduct(@RequestBody Product product,
                @PathVariable("id") Long productId)
    {
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
                                  Long productId)
    {
        productService.deleteProductById(
                productId);

        return buildResponse(
                true,
                "Deleted Successfully",
                null
        );
    }
}
