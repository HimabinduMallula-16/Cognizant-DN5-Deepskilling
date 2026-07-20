package com.cognizant.paymentservice.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PaymentService {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentService.class);

    @CircuitBreaker(name = "paymentService",
                    fallbackMethod = "fallbackPayment")
    public String processPayment() throws InterruptedException {

        logger.info("Calling Third Party Payment Gateway...");

        Thread.sleep(5000);

        throw new RuntimeException("Payment Gateway Timeout");
    }

    public String fallbackPayment(Exception ex) {

        logger.error("Fallback Triggered : {}", ex.getMessage());

        return "Payment service unavailable at "
                + LocalDateTime.now()
                + ". Please try again later.";
    }
}