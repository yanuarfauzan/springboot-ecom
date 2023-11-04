package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.Order;

public interface OrderRepo extends JpaRepository<Order, String> {
    
}
