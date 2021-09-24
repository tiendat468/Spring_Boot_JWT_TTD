package com.example.springbootjwt_ttd.repository;

import com.example.springbootjwt_ttd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
