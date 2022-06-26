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
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Long productId) {
      Product product1= productRepository.findById(productId).get();
      if (product1!=null){
          return productRepository.save(product);

      }
      else {
          return productRepository.save(product);
      }
    }

    @Override
    public void deleteProductById(Long productId) {
        Product product1= productRepository.findById(productId).get();
        if (product1!=null)
         productRepository.deleteById(productId);

    }

    @Override
    public List<Product> listProducts() {
       return productRepository.findAll();
    }
}
