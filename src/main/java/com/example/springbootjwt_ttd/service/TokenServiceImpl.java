package com.example.springbootjwt_ttd.service;

import com.example.springbootjwt_ttd.entity.Token;
import com.example.springbootjwt_ttd.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{

    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {

        return tokenRepository.saveAndFlush(token);
    }
}
