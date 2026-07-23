package com.cognizant.employeeservice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.employeeservice.dao.DepartmentDao;
import com.cognizant.employeeservice.model.Department;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Transactional(readOnly = true)
    public ArrayList<Department> getAllDepartments() {

        return departmentDao.getAllDepartments();
    }

}