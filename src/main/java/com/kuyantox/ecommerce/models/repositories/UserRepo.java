package com.kuyantox.ecommerce.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuyantox.ecommerce.models.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
}
