package com.flutterDemo.flutterDemo.repository.impl;

import com.flutterDemo.flutterDemo.model.Product;
import com.flutterDemo.flutterDemo.repository.ProductRepository;

import javax.persistence.EntityManager;

public class ProductRepositoryImpl  extends AbstractRepositoryImpl<Product, Long> implements ProductRepository {
    public ProductRepositoryImpl(Class<Product> entityClass) {
        super(entityClass);
    }

    @Override
    protected EntityManager getEntityManager() {
        return null;
    }
}
