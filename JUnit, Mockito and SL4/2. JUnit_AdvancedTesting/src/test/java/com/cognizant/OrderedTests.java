package com.cognizant;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OrderedTests {

    @Test
    @Order(1)

    void login(){

        System.out.println("Login");

    }

    @Test
    @Order(2)

    void search(){

        System.out.println("Search Product");

    }

    @Test
    @Order(3)

    void payment(){

        System.out.println("Payment");

    }

    @Test
    @Order(4)

    void logout(){

        System.out.println("Logout");

    }

}