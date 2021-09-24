package com.example.springbootjwt_ttd.service;

import com.example.springbootjwt_ttd.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
