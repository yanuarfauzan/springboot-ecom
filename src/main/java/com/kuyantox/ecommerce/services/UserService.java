package com.kuyantox.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuyantox.ecommerce.models.entities.User;
import com.kuyantox.ecommerce.models.repositories.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

}
