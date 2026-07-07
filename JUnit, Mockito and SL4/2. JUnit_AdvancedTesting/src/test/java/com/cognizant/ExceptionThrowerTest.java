package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    ExceptionThrower object = new ExceptionThrower();

    @Test

    void testException(){

        assertThrows(

                ArithmeticException.class,

                () -> object.throwException()

        );

    }

}