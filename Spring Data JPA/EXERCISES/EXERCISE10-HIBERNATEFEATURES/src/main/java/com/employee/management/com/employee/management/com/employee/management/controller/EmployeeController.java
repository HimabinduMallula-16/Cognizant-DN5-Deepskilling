package com.employee.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController

@RequestMapping("/employees")

public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service){

        this.service=service;

    }

    @PostMapping

    public Employee saveEmployee(

            @RequestBody Employee employee){

        return service.saveEmployee(employee);

    }

    @PostMapping("/batch")

    public List<Employee> batchInsert(

            @RequestBody List<Employee> employees){

        return service.saveEmployees(employees);

    }

    @GetMapping

    public List<Employee> getAll(){

        return service.getAllEmployees();

    }

}