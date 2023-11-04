package com.kuyantox.ecommerce.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuyantox.ecommerce.exception.ResourceNotFoundException;
import com.kuyantox.ecommerce.models.entities.Category;
import com.kuyantox.ecommerce.models.repositories.CategoryRepo;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category findById(String id) {
        return categoryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Kategori dengan id " + id + " tidak ditemukan"));
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    public Category create(Category category) {
        category.setId(UUID.randomUUID().toString());
        return categoryRepo.save(category);
    }

    public Category edit(Category category) {
        return categoryRepo.save(category);
    }

    public void deleteById(String id) {
        categoryRepo.deleteById(id);
    }

}
