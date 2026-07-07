package com.cognizant.hqljpqldemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.hqljpqldemo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    // Hands-on 2
    @Query("SELECT e FROM Employee e WHERE e.permanent=true")
    List<Employee> getAllPermanentEmployees();

    // Optimized HQL using fetch
    @Query("""
           SELECT DISTINCT e
           FROM Employee e
           LEFT JOIN FETCH e.department
           LEFT JOIN FETCH e.skillList
           WHERE e.permanent=true
           """)
    List<Employee> getAllPermanentEmployeesFetch();

    // Hands-on 4
    @Query("SELECT AVG(e.salary) FROM Employee e WHERE e.department.id=:id")
    Double getAverageSalary(@Param("id") int id);

    // Hands-on 5
    @Query(value="SELECT * FROM employee",nativeQuery=true)
    List<Employee> getAllEmployeesNative();

}