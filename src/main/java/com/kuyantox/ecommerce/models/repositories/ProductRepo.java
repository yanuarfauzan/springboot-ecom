package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.Product;

public interface ProductRepo extends JpaRepository<Product, String> {
    
}
