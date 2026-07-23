package com.employee.management.repository;

import java.util.List;
import com.employee.management.projection.EmployeeDTO;
import com.employee.management.projection.EmployeeView;
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

    // Interface Projection

List<EmployeeView> findAllProjectedBy();


// Class Projection

@Query("""
SELECT new com.employee.management.projection.EmployeeDTO
(e.id,e.name,e.email)
FROM Employee e
""")

List<EmployeeDTO> getEmployeeDTO();
    // @Query Annotation

    @Query("SELECT e FROM Employee e WHERE e.email=:email")
    Employee getEmployeeByEmail(@Param("email") String email);

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:keyword%")
    List<Employee> searchEmployees(@Param("keyword") String keyword);

}