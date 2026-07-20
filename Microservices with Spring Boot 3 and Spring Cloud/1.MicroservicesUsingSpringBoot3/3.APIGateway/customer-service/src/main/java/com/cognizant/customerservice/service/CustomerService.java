package com.cognizant.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.customerservice.entity.Customer;
import com.cognizant.customerservice.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer save(Customer customer){
        return repository.save(customer);
    }

    public List<Customer> getAll(){
        return repository.findAll();
    }
}