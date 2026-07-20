package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.employee.management.entity.Department;
import com.employee.management.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return service.getDepartment(id);
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id,
                                       @RequestBody Department department) {
        return service.updateDepartment(id, department);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        service.deleteDepartment(id);
        return "Department Deleted Successfully";
    }
}