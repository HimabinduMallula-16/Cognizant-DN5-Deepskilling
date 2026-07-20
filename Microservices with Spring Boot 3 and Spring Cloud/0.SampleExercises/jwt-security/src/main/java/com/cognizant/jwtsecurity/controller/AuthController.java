package com.cognizant.jwtsecurity.controller;

import com.cognizant.jwtsecurity.jwt.JwtTokenProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/token")
    public String token() {
        return jwtTokenProvider.generateToken("Himabindu");
    }
}