package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, String> {
    
}
