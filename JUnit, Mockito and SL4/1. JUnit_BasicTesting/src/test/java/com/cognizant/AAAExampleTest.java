package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAExampleTest {

    Calculator calculator;

    @Before
    public void setup() {

        calculator = new Calculator();

        System.out.println("Setup Executed");

    }

    @After
    public void tearDown() {

        System.out.println("Teardown Executed");

    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(50, result);

    }

}