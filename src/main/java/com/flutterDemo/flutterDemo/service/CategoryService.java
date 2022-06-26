package com.flutterDemo.flutterDemo.service;

import com.flutterDemo.flutterDemo.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> listCategories();
    Category updateCategory(Category category,
                            Long categoryId);

    // Delete operation
    void deleteCategoryById(Long categoryId);
}
