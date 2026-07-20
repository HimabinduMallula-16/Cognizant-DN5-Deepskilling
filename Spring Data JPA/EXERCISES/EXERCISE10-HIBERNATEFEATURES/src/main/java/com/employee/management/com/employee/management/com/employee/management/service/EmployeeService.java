package com.employee.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){

        this.repository=repository;

    }

    public List<Employee> getAllEmployees(){

        return repository.findAll();

    }

    public Employee saveEmployee(Employee employee){

        return repository.save(employee);

    }

    // Batch Insert

    public List<Employee> saveEmployees(List<Employee> employees){

        return repository.saveAll(employees);

    }

}