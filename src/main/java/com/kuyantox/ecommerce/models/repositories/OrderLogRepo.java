package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.OrderLog;

public interface OrderLogRepo extends JpaRepository<OrderLog, String>{
    
}
