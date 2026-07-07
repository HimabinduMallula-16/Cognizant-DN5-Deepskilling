package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Rahul";
        int age = 21;
        double salary = 50000.50;

        logger.info("User Name: {}", username);

        logger.info("Age: {}", age);

        logger.info("Salary: {}", salary);

        logger.info("User {} is {} years old and earns {}.",
                username, age, salary);

    }
}