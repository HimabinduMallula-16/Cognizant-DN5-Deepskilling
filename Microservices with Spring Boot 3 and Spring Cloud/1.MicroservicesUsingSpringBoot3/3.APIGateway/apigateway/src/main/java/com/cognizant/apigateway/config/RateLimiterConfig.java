package com.cognizant.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class RateLimiterConfig {

    private final ConcurrentHashMap<String, AtomicInteger> requests = new ConcurrentHashMap<>();

    @Bean
    public ConcurrentHashMap<String, AtomicInteger> rateLimiter() {
        return requests;
    }
}