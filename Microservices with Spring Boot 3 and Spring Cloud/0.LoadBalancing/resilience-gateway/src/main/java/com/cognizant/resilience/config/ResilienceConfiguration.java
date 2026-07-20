package com.cognizant.resilience.config;

import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

@Configuration
public class ResilienceConfiguration {

    @Bean
    Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {

        return factory ->

                factory.configureDefault(id ->

                        new org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder(id)

                                .circuitBreakerConfig(
                                        CircuitBreakerConfig.ofDefaults())

                                .timeLimiterConfig(
                                        TimeLimiterConfig.ofDefaults())

                                .build());

    }

}