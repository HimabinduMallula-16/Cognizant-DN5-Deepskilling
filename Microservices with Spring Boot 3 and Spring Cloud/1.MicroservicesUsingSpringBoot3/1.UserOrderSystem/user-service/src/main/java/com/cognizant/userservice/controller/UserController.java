package com.cognizant.userservice.controller;

import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.save(user);
    }
    @GetMapping("/{id}")
public User getUserById(@PathVariable Long id) {
    return service.getById(id);
}
    @GetMapping
    public List<User> getUsers() {
        return service.getAll();
    }
}