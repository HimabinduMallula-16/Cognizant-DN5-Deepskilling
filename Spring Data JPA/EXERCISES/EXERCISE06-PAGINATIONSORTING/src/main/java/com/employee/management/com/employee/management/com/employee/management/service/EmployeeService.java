package com.employee.management.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
    // Pagination

public Page<Employee> getEmployees(Pageable pageable) {

    return repository.findAll(pageable);

}
// Pagination
public Page<Employee> getEmployeesPage(Pageable pageable) {
    return repository.findAll(pageable);
}

// Sorting
public List<Employee> getEmployeesSorted(String field) {
    return repository.findAll(Sort.by(Sort.Direction.ASC, field));
}

// Pagination + Sorting
public Page<Employee> getEmployeesPageSorted(int page,
                                             int size,
                                             String field) {

    Pageable pageable =
            PageRequest.of(page, size,
                    Sort.by(field));

    return repository.findAll(pageable);
}

// Sorting

public List<Employee> getEmployeesSorted(String field) {

    return repository.findAll(Sort.by(field));

}

// Pagination + Sorting

public Page<Employee> getEmployees(Pageable pageable,
                                   String field) {

    Pageable sortedPage =
            PageRequest.of(
                    pageable.getPageNumber(),
                    pageable.getPageSize(),
                    Sort.by(field));

    return repository.findAll(sortedPage);

}

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
    public List<Employee> getEmployeesByName(String name){

    return repository.findByName(name);

}

public Employee getEmployeeByEmail(String email){

    return repository.getEmployeeByEmail(email);

}

public List<Employee> searchEmployees(String keyword){

    return repository.searchEmployees(keyword);

}

public List<Employee> getEmployeesByDepartment(String department){

    return repository.findByDepartmentName(department);

}
}