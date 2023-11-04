package com.kuyantox.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuyantox.ecommerce.models.entities.Category;
import com.kuyantox.ecommerce.services.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category findById(@PathVariable("id") String id) {
        return categoryService.findById(id);
    }

    @PostMapping("/categories/create")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @PostMapping("/categories/edit")
    public Category edit(@RequestBody Category category) {
        return categoryService.edit(category);
    }

    @DeleteMapping("categories/{id}")
    public void delete(@PathVariable("id") String id) {
        categoryService.deleteById(id);
    }

}
