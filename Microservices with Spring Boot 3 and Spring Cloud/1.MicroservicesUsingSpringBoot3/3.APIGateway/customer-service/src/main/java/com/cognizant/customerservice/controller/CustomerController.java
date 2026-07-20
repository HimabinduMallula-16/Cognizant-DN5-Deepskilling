package com.cognizant.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.customerservice.entity.Customer;
import com.cognizant.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return service.save(customer);
    }

    @GetMapping
    public List<Customer> getAll(){
        return service.getAll();
    }
}