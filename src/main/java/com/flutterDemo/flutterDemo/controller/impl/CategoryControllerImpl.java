package com.flutterDemo.flutterDemo.controller.impl;

import com.flutterDemo.flutterDemo.controller.BaseController;
import com.flutterDemo.flutterDemo.controller.CategoryController;
import com.flutterDemo.flutterDemo.model.Category;
import com.flutterDemo.flutterDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;


public class CategoryControllerImpl extends BaseController implements CategoryController {

    @Autowired
    private final CategoryService categoryService;

    public CategoryControllerImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Response saveCategory(@RequestBody Category category){
         categoryService.saveCategory(category);
        return buildResponse(
                true,
                "Saved successfully",
                null
        );
    }

    public Response listCategories() {
       Category category= (Category) categoryService.listCategories();
        return buildResponse(
                true,
                "Success",
                category
        );
    }
    public Response
    updateCategory(@RequestBody Category category,
                @PathVariable("id") Long categoryId)
    {
         categoryService.updateCategory(
                category, categoryId);
        return buildResponse(
                true,
                "Updated successfully",
                null
        );
    }

    // Delete operation
    public Response deleteCategoryById(@PathVariable("id")
                                  Long category)
    {

        categoryService.deleteCategoryById(
                category);

        return buildResponse(false, "Deleted Successfully", null) ;
    }
}
