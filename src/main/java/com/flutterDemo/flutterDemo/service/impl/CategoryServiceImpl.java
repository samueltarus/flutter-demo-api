package com.flutterDemo.flutterDemo.service.impl;

import com.flutterDemo.flutterDemo.model.Category;
import com.flutterDemo.flutterDemo.repository.CategoryRepository;
import com.flutterDemo.flutterDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {

        Category category1 =categoryRepository.findById(categoryId).get();
        return categoryRepository.save(category1);
    }

    @Override
    public void deleteCategoryById(Long categoryId) {
        Category category1 =categoryRepository.findById(categoryId).get();
        categoryRepository.delete(category1);

    }

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }
}
