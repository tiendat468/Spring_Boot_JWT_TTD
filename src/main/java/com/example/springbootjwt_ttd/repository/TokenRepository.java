package com.example.springbootjwt_ttd.repository;

import com.example.springbootjwt_ttd.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token,Long> {
}
