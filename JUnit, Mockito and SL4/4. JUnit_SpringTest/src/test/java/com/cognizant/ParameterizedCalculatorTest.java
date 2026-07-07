package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cognizant.service.CalculatorService;

public class ParameterizedCalculatorTest {

    CalculatorService calculatorService =
            new CalculatorService();

    @ParameterizedTest
    @CsvSource({

            "10,20,30",

            "5,5,10",

            "100,50,150",

            "-10,20,10",

            "0,0,0"

    })

    public void testAddition(int a,
                             int b,
                             int expected) {

        assertEquals(
                expected,
                calculatorService.add(a, b)
        );

    }

}