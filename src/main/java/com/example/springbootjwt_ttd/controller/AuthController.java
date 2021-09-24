package com.example.springbootjwt_ttd.controller;

import com.example.springbootjwt_ttd.entity.User;
import com.example.springbootjwt_ttd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder()
                .encode(user.getPassword()));

        return userService.createUser(user);
    }
}
