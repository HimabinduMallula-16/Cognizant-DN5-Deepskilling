package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cognizant.service.CalculatorService;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {

        int result = calculatorService.add(10, 20);

        assertEquals(30, result);

    }

}