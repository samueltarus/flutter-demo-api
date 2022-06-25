package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Category;
import com.flutterDemo.flutterDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping("/list")
    public List<Category> listCategories() {
       return categoryService.listCategories();
    }
}
