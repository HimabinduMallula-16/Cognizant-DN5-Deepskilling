# Employee REST Service using Spring Boot

## Overview

This project is part of the **Cognizant Digital Nurture 5.0 – Spring REST using Spring Boot** hands-on exercises.

The application demonstrates how to build RESTful web services using the **Controller-Service-DAO architecture** with **Spring XML Configuration** as the data source.

Instead of connecting to a database, employee and department data are stored in an XML configuration file (`employee.xml`) and exposed through REST APIs.

---

## Objectives

- Create static employee and department data using Spring XML Configuration.
- Implement DAO, Service, and Controller layers.
- Develop RESTful GET APIs.
- Consume data from Spring XML configuration.
- Test REST APIs using Postman.
- Verify REST service execution through application logs.

---

## Project Architecture

```
Controller
     │
     ▼
Service
     │
     ▼
DAO
     │
     ▼
employee.xml (Spring XML Configuration)
```

---

## Technologies Used

- Java 17
- Spring Boot 3.5.x
- Spring Web
- Spring XML Configuration
- Maven
- SLF4J Logging
- Lombok
- Spring DevTools
- Postman

---

## Project Structure

```
employee-service
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.employeeservice
│   │       │
│   │       ├── controller
│   │       │     ├── EmployeeController.java
│   │       │     └── DepartmentController.java
│   │       │
│   │       ├── dao
│   │       │     ├── EmployeeDao.java
│   │       │     └── DepartmentDao.java
│   │       │
│   │       ├── service
│   │       │     ├── EmployeeService.java
│   │       │     └── DepartmentService.java
│   │       │
│   │       ├── model
│   │       │     ├── Employee.java
│   │       │     ├── Department.java
│   │       │     └── Skill.java
│   │       │
│   │       └── EmployeeServiceApplication.java
│   │
│   └── resources
│         ├── application.properties
│         └── employee.xml
│
└── pom.xml
```

---

## REST APIs

### Get All Employees

**Method**

```
GET
```

**URL**

```
http://localhost:8084/employees
```

---

### Get All Departments

**Method**

```
GET
```

**URL**

```
http://localhost:8084/departments
```

---

## Features

- Static employee data using Spring XML configuration
- Static department data using Spring XML configuration
- Layered architecture (Controller → Service → DAO)
- RESTful GET endpoints
- XML-based dependency configuration
- SLF4J logging
- JSON response generation
- Postman tested APIs

---

## How to Run

1. Clone the repository.

2. Open the project in Eclipse/STS or IntelliJ IDEA.

3. Update Maven dependencies.

4. Run

```
EmployeeServiceApplication.java
```

5. Open Postman or browser.

6. Test:

```
GET http://localhost:8084/employees
```

```
GET http://localhost:8084/departments
```

---

## Expected Output

### Employees

Returns a JSON array containing employee details including:

- Employee ID
- Name
- Salary
- Permanent Status
- Department
- Skills

### Departments

Returns a JSON array of available departments.

---

## Learning Outcomes

- Spring Boot REST API development
- Spring XML Configuration
- Controller-Service-DAO architecture
- Dependency Injection
- RESTful Web Services
- Maven Project Management
- API Testing using Postman
- Application Logging using SLF4J

---

## Author

**HIMABINDU MALLULA**

B.Tech – Electronics and Communication Engineering (ECE)

Institute of Aeronautical Engineering (IARE)

Hyderabad, India

---

## Course

**Cognizant Digital Nurture 5.0**

Spring REST using Spring Boot – Employee REST Service Hands-on