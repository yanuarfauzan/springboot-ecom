package com.kuyantox.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuyantox.ecommerce.models.entities.User;
import com.kuyantox.ecommerce.services.UserService;
import com.kuyantox.ecommerce.utils.FormLogin;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

}
