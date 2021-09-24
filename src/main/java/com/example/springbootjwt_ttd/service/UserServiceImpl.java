package com.example.springbootjwt_ttd.service;

import com.example.springbootjwt_ttd.authen.UserPrincipal;
import com.example.springbootjwt_ttd.entity.User;
import com.example.springbootjwt_ttd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {

        return null;
    }
}
