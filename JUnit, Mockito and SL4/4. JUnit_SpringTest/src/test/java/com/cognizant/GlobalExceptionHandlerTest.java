package com.cognizant;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.context.annotation.Import;

import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.controller.UserController;
import com.cognizant.exception.GlobalExceptionHandler;
import com.cognizant.service.UserService;

@WebMvcTest(UserController.class)
@Import(GlobalExceptionHandler.class)
public class GlobalExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testUserNotFoundException() throws Exception {

        when(userService.getUserById(100L))
                .thenThrow(new NoSuchElementException("User not found"));

        mockMvc.perform(get("/users/100"))

                .andExpect(status().isNotFound())

                .andExpect(content().string("User not found"));

    }

}