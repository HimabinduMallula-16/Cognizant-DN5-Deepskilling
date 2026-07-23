package com.cognizant.employeeservice.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeeservice.model.Employee;
import com.cognizant.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees() {

        LOGGER.info("START");

        ArrayList<Employee> employeeList =
                employeeService.getAllEmployees();

        LOGGER.debug("Employees : {}", employeeList);

        LOGGER.info("END");

        return employeeList;
    }
}