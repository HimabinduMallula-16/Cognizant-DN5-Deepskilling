package com.employee.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employee.management.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

    // Derived Query Methods

    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByDepartmentName(String departmentName);

    // @Query Annotation

    @Query("SELECT e FROM Employee e WHERE e.email=:email")
    Employee getEmployeeByEmail(@Param("email") String email);

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:keyword%")
    List<Employee> searchEmployees(@Param("keyword") String keyword);

}