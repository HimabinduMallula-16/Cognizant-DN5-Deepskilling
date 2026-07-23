package com.cognizant.hibernatemappingsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hibernatemappingsdemo.model.Department;
import com.cognizant.hibernatemappingsdemo.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Transactional
    public List<Department> getAllDepartments(){

        return repository.findAll();

    }

    @Transactional
    public Department getDepartment(int id){

        return repository.findById(id).orElse(null);

    }

}