package com.cognizant.userservice.service;

import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }
    public User getById(Long id) {
    return repository.findById(id).orElse(null);
}
    public List<User> getAll() {
        return repository.findAll();
    }
}