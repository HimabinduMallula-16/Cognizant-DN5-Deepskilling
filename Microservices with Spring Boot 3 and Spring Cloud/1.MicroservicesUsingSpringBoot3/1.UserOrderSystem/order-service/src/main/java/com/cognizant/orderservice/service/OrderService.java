package com.cognizant.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orderservice.dto.User;
import com.cognizant.orderservice.entity.Order;
import com.cognizant.orderservice.feign.UserClient;
import com.cognizant.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private UserClient userClient;

    public Order save(Order order) {

        User user = userClient.getUser(order.getUserId());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        return repository.save(order);
    }

    public List<Order> getAll() {
        return repository.findAll();
    }
}