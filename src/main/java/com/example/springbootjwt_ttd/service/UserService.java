package com.example.springbootjwt_ttd.service;

import com.example.springbootjwt_ttd.authen.UserPrincipal;
import com.example.springbootjwt_ttd.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
