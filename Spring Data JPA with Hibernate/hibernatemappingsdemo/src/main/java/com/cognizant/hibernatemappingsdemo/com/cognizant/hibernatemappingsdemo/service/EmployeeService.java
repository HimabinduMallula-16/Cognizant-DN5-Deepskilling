package com.cognizant.hibernatemappingsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hibernatemappingsdemo.model.Employee;
import com.cognizant.hibernatemappingsdemo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public List<Employee> getAllEmployees(){

        return repository.findAll();

    }

    @Transactional
    public Employee getEmployee(int id){

        return repository.findById(id).orElse(null);

    }

}