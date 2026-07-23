package com.cognizant.hqljpqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hqljpqldemo.model.Employee;
import com.cognizant.hqljpqldemo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public List<Employee> getAllEmployees() {

        return repository.findAll();

    }

    @Transactional
    public Employee getEmployee(int id) {

        return repository.findById(id).orElse(null);

    }

    // Hands-on 2

    @Transactional
    public List<Employee> getAllPermanentEmployees() {

        return repository.getAllPermanentEmployees();

    }

    @Transactional
    public List<Employee> getAllPermanentEmployeesFetch() {

        return repository.getAllPermanentEmployeesFetch();

    }

    // Hands-on 4

    @Transactional
    public Double getAverageSalary(int id){

        return repository.getAverageSalary(id);

    }

    // Hands-on 5

    @Transactional
    public List<Employee> getAllEmployeesNative(){

        return repository.getAllEmployeesNative();

    }

}