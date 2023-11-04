package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, String> {
    
}
