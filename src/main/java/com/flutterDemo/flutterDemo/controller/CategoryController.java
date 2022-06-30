package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Category;
import com.flutterDemo.flutterDemo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
@Log
public class CategoryController  {

    @Autowired
    private final CategoryService categoryService;

    public Category saveCategory(@RequestBody Category category){

        return categoryService.saveCategory(category);
    }
    @GetMapping("/list")
    public List<Category> listCategories() {
        return categoryService.listCategories();
    }
    @PutMapping("/{id}")
    public Category
    updateCategory(@RequestBody Category category,
                @PathVariable("id") Long categoryId)
    {

        return   categoryService.updateCategory(
                category, categoryId);
    }
    @DeleteMapping("/{id}")
    // Delete operation
    public Category deleteCategoryById(@PathVariable("id")
                                  Long category)
    {

        categoryService.deleteCategoryById(
                category);

        return null;
    }
}
