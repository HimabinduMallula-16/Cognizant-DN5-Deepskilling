package com.cognizant.orderservice.controller;

import com.cognizant.orderservice.entity.Order;
import com.cognizant.orderservice.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return service.getAll();
    }
}