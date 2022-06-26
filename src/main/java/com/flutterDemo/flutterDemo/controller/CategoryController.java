package com.flutterDemo.flutterDemo.controller;

import com.flutterDemo.flutterDemo.model.Category;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;


@RestController
@RequestMapping("/api/categories")
public interface CategoryController {

    @PostMapping("/save")
    public Response saveCategory(@RequestBody Category category);

    @GetMapping("/list")
    public Response  listCategories();
    @PutMapping("/{id}")

    public Response updateCategory(@RequestBody Category category,
                   @PathVariable("id") Long categoryId);

    // Delete operation
    @DeleteMapping("/{id}")
    public  Response  deleteCategoryById(@PathVariable("id")
                                     Long category);
}
