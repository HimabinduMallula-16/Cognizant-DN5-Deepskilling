package com.employee.management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("/name/{name}")
public List<Employee> getByName(@PathVariable String name){

    return service.getEmployeesByName(name);

}
@GetMapping("/page")

public Page<Employee> getEmployeesPage(

        @RequestParam(defaultValue="0") int page,

        @RequestParam(defaultValue="5") int size){

    Pageable pageable=PageRequest.of(page,size);

    return service.getEmployees(pageable);

}
@GetMapping("/sort/{field}")

public List<Employee> sortEmployees(

        @PathVariable String field){

    return service.getEmployeesSorted(field);

}
@GetMapping("/page-sort")

public Page<Employee> pageAndSort(

        @RequestParam(defaultValue="0") int page,

        @RequestParam(defaultValue="5") int size,

        @RequestParam(defaultValue="name") String field){

    Pageable pageable=PageRequest.of(page,size);

    return service.getEmployees(pageable,field);

}

@GetMapping("/email/{email}")
public Employee getByEmail(@PathVariable String email){

    return service.getEmployeeByEmail(email);

}

@GetMapping("/search/{keyword}")
public List<Employee> searchEmployees(@PathVariable String keyword){

    return service.searchEmployees(keyword);

}

@GetMapping("/department/{department}")
public List<Employee> getByDepartment(@PathVariable String department){

    return service.getEmployeesByDepartment(department);

}

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }
}