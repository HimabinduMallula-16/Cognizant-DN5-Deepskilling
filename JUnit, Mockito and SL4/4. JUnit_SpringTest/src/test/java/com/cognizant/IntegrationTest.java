package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.entity.User;
import com.cognizant.service.UserService;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveAndRetrieveUser() {

        User user = new User();
        user.setId(1L);
        user.setName("Rahul");

        userService.saveUser(user);

        User result = userService.getUserById(1L);

        assertEquals("Rahul", result.getName());
    }
}