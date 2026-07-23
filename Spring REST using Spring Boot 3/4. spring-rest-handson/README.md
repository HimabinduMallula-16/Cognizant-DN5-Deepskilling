# Spring REST CRUD Validation

## Overview

This project is developed as part of the **Cognizant Digital Nurture 5.0 – Spring REST using Spring Boot** hands-on.

The application demonstrates the implementation of RESTful Web Services using Spring Boot. It includes CRUD operations, request validation, exception handling, and XML-based data configuration without using a database.

---

## Features

- RESTful Web Services
- GET, POST, PUT and DELETE APIs
- Bean Validation using Jakarta Validation
- Global Exception Handling
- XML-based data configuration
- Layered Architecture (Controller → Service → DAO)
- JSON Request and Response handling
- Logging using SLF4J
- API Testing using Postman

---

## Technologies Used

- Java 17
- Spring Boot 3.5.4
- Spring Web
- Spring Validation
- Maven
- SLF4J Logging
- Lombok
- Spring Boot DevTools
- Postman

---

## Project Structure

```
spring-rest-crud-validation
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.springlearn
│   │       │
│   │       ├── controller
│   │       │     ├── CountryController.java
│   │       │     └── EmployeeController.java
│   │       │
│   │       ├── dao
│   │       │     ├── CountryDao.java
│   │       │     └── EmployeeDao.java
│   │       │
│   │       ├── exception
│   │       │     ├── EmployeeNotFoundException.java
│   │       │     └── GlobalExceptionHandler.java
│   │       │
│   │       ├── model
│   │       │     ├── Country.java
│   │       │     ├── Department.java
│   │       │     ├── Employee.java
│   │       │     └── Skill.java
│   │       │
│   │       ├── service
│   │       │     ├── CountryService.java
│   │       │     └── EmployeeService.java
│   │       │
│   │       └── SpringRestCrudValidationApplication.java
│   │
│   └── resources
│       ├── application.properties
│       ├── country.xml
│       └── employee.xml
│
└── pom.xml
```

---

## REST APIs

### Country APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/countries` | Get all countries |
| GET | `/countries/{code}` | Get country by code |
| POST | `/countries` | Add a new country |

---

### Employee APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees` | Get all employees |
| PUT | `/employees` | Update an employee |
| DELETE | `/employees/{id}` | Delete an employee |

---

## Validation

The application validates incoming requests using Jakarta Bean Validation.

Examples include:

- Country code must contain exactly 2 characters.
- Employee name cannot be blank.
- Salary must be greater than or equal to zero.
- Department and Skill names cannot be blank.
- Invalid numeric values are handled through global exception handling.

---

## Exception Handling

A global exception handler is implemented using `@ControllerAdvice` to provide meaningful error responses for:

- Validation failures
- Invalid JSON request formats
- Incorrect data types
- Employee not found scenarios

---

## How to Run

1. Clone the repository.

2. Open the project in VS Code, Eclipse, or IntelliJ IDEA.

3. Update Maven dependencies.

4. Run:

```
SpringRestCrudValidationApplication.java
```

5. Open Postman.

6. Test the APIs using:

```
GET http://localhost:8085/countries
```

```
GET http://localhost:8085/countries/IN
```

```
POST http://localhost:8085/countries
```

```
GET http://localhost:8085/employees
```

```
PUT http://localhost:8085/employees
```

```
DELETE http://localhost:8085/employees/{id}
```

---

## Sample JSON Request

### Add Country

```json
{
    "code": "AU",
    "name": "Australia"
}
```

### Update Employee

```json
{
    "id": 1,
    "name": "John Smith",
    "salary": 75000,
    "permanent": true,
    "dateOfBirth": "20/08/2001",
    "department": {
        "id": 1,
        "name": "Engineering"
    },
    "skills": [
        {
            "id": 101,
            "name": "Java"
        },
        {
            "id": 102,
            "name": "Spring Boot"
        }
    ]
}
```

---

## Learning Outcomes

- Spring Boot REST API development
- RESTful API design
- CRUD operations
- Request validation
- Global exception handling
- XML-based configuration
- Dependency Injection
- Layered Architecture
- JSON request and response handling
- API testing with Postman

---

## Author

**Himabindu Mallula**

B.Tech – Electronics and Communication Engineering (ECE)

Institute of Aeronautical Engineering (IARE)

---

## Course

**Cognizant Digital Nurture 5.0**

Spring REST using Spring Boot – CRUD Operations and Validation