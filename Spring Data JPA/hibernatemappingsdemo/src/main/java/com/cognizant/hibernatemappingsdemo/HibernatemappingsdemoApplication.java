package com.cognizant.hibernatemappingsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.hibernatemappingsdemo.model.Department;
import com.cognizant.hibernatemappingsdemo.model.Employee;
import com.cognizant.hibernatemappingsdemo.model.Skill;
import com.cognizant.hibernatemappingsdemo.service.DepartmentService;
import com.cognizant.hibernatemappingsdemo.service.EmployeeService;
import com.cognizant.hibernatemappingsdemo.service.SkillService;

@SpringBootApplication
public class HibernateMappingsDemoApplication {

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(HibernateMappingsDemoApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // Uncomment ONE test at a time

        // testGetEmployee();

        // testGetDepartment();

        // testGetSkill();

        // testEmployeeDepartment();

        // testDepartmentEmployees();

        // testEmployeeSkills();
    }

    // ==========================
    // Hands-on 3
    // ==========================

    private static void testGetEmployee() {

        System.out.println("\n===== Employee =====");

        Employee employee = employeeService.getEmployee(1);

        System.out.println(employee);

    }

    private static void testGetDepartment() {

        System.out.println("\n===== Department =====");

        Department department = departmentService.getDepartment(2);

        System.out.println(department);

    }

    private static void testGetSkill() {

        System.out.println("\n===== Skill =====");

        Skill skill = skillService.getSkill(1);

        System.out.println(skill);

    }

    // ==========================
    // Hands-on 4
    // ==========================

    private static void testEmployeeDepartment() {

        Employee employee = employeeService.getEmployee(1);

        System.out.println(employee);

        System.out.println(employee.getDepartment());

    }

    // ==========================
    // Hands-on 5
    // ==========================

    private static void testDepartmentEmployees() {

        Department department = departmentService.getDepartment(2);

        System.out.println(department);

        department.getEmployeeList()
                .forEach(System.out::println);

    }

    // ==========================
    // Hands-on 6
    // ==========================

    private static void testEmployeeSkills() {

        Employee employee = employeeService.getEmployee(1);

        System.out.println(employee);

        employee.getSkillList()
                .forEach(System.out::println);

    }

}