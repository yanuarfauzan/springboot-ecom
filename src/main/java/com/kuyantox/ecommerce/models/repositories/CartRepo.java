package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.Cart;

public interface CartRepo extends JpaRepository<Cart, String> {
    
}
