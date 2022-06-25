package com.flutterDemo.flutterDemo.service;

import com.flutterDemo.flutterDemo.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> listCategories();
}
