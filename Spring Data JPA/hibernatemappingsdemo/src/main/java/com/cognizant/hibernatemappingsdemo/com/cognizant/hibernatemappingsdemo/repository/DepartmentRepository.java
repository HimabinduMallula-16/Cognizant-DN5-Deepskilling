package com.cognizant.hibernatemappingsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.hibernatemappingsdemo.model.Department;

@Repository
public interface DepartmentRepository
        extends JpaRepository<Department,Integer>{

}