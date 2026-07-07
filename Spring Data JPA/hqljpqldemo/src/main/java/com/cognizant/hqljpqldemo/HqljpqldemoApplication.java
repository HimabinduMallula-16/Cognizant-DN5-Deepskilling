package com.cognizant.hqljpqldemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.hqljpqldemo.model.Employee;
import com.cognizant.hqljpqldemo.service.EmployeeService;

@SpringBootApplication
public class HqlJpqlDemoApplication {

    private static EmployeeService employeeService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(HqlJpqlDemoApplication.class,args);

        employeeService=context.getBean(EmployeeService.class);

        // Uncomment ONE at a time

        testGetPermanentEmployees();

        //testGetPermanentEmployeesFetch();

        //testAverageSalary();

        //testNativeQuery();

    }

    private static void testGetPermanentEmployees(){

        System.out.println("\nPermanent Employees\n");

        List<Employee> list=
                employeeService.getAllPermanentEmployees();

        list.forEach(System.out::println);

    }

    private static void testGetPermanentEmployeesFetch(){

        System.out.println("\nPermanent Employees (Fetch Join)\n");

        List<Employee> list=
                employeeService.getAllPermanentEmployeesFetch();

        list.forEach(e->{

            System.out.println(e);

            System.out.println(e.getDepartment());

            System.out.println(e.getSkillList());

        });

    }

    private static void testAverageSalary(){

        System.out.println(
                employeeService.getAverageSalary(2));

    }

    private static void testNativeQuery(){

        employeeService
                .getAllEmployeesNative()
                .forEach(System.out::println);

    }

}