package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.springlearn.model.Employee;
import com.cognizant.springlearn.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ArrayList<Employee> getAllEmployees() {

        LOGGER.info("Start");
        ArrayList<Employee> employees = employeeService.getAllEmployees();
        LOGGER.info("End");

        return employees;
    }

    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee) {

        LOGGER.info("Start");

        employeeService.updateEmployee(employee);

        LOGGER.info("Employee Updated Successfully");
        LOGGER.info("End");
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {

        LOGGER.info("Start");

        employeeService.deleteEmployee(id);

        LOGGER.info("Employee Deleted Successfully");
        LOGGER.info("End");
    }

}