# Spring REST JWT Security

## Overview

This project demonstrates how to secure RESTful Web Services using **Spring Security** and **JWT (JSON Web Token)** in Spring Boot.

It is developed as part of the **Cognizant Digital Nurture 5.0 – Spring REST using Spring Boot** hands-on. The application authenticates users using HTTP Basic Authentication, generates a JWT token, and authorizes subsequent requests using the token.

---

## Features

- RESTful Web Services
- Spring Security
- HTTP Basic Authentication
- JWT Authentication
- JWT Authorization Filter
- In-Memory User Authentication
- Role-Based Authorization
- Secure REST APIs
- XML-Based Country Data
- API Testing using Postman

---

## Technologies Used

- Java 17
- Spring Boot 3.5.4
- Spring Security
- Spring Web
- Maven
- JSON Web Token (JJWT)
- Lombok
- Spring Boot DevTools
- Postman

---

## Project Structure

```
spring-rest-jwt-security
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.springlearn
│   │       │
│   │       ├── controller
│   │       │     ├── AuthenticationController.java
│   │       │     └── CountryController.java
│   │       │
│   │       ├── dao
│   │       │     └── CountryDao.java
│   │       │
│   │       ├── model
│   │       │     └── Country.java
│   │       │
│   │       ├── security
│   │       │     ├── SecurityConfig.java
│   │       │     └── JwtAuthorizationFilter.java
│   │       │
│   │       ├── service
│   │       │     └── CountryService.java
│   │       │
│   │       └── SpringRestJwtSecurityApplication.java
│   │
│   └── resources
│       ├── application.properties
│       └── country.xml
│
└── pom.xml
```

---

## Authentication Flow

1. User sends username and password using HTTP Basic Authentication.
2. Spring Security validates the credentials.
3. `/authenticate` endpoint generates a JWT token.
4. Client stores the JWT token.
5. Client sends the JWT token in the Authorization header.
6. JWT Authorization Filter validates the token.
7. If valid, access to secured REST APIs is granted.

---

## In-Memory Users

| Username | Password | Role |
|----------|----------|------|
| user | pwd | USER |
| admin | pwd | ADMIN |

---

## REST APIs

### Get JWT Token

| Method | Endpoint |
|---------|----------|
| GET | `/authenticate` |

Authorization:

```
Basic Auth
Username : user
Password : pwd
```

---

### Get All Countries

| Method | Endpoint |
|---------|----------|
| GET | `/countries` |

Authorization Header

```
Authorization: Bearer <JWT_TOKEN>
```

---

## Sample Responses

### Authentication

Request

```
GET /authenticate
```

Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

---

### Countries

Request

```
GET /countries
```

Header

```
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```

Response

```json
[
    {
        "code":"US",
        "name":"United States"
    },
    {
        "code":"DE",
        "name":"Germany"
    },
    {
        "code":"IN",
        "name":"India"
    },
    {
        "code":"JP",
        "name":"Japan"
    }
]
```

---

## Security Features

- HTTP Basic Authentication
- Password Encryption using BCrypt
- JWT Token Generation
- JWT Token Validation
- Role-Based Authorization
- Authentication Filter
- Stateless Authentication

---

## How to Run

1. Clone the repository.

2. Open the project in IntelliJ IDEA, Eclipse, or VS Code.

3. Update Maven dependencies.

4. Run the application:

```
SpringRestJwtSecurityApplication.java
```

5. Open Postman.

6. Generate a JWT token:

```
GET http://localhost:8090/authenticate
```

7. Copy the generated token.

8. Access the secured REST API:

```
GET http://localhost:8090/countries
```

Add the following header:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Security
- Spring Boot Starter Validation
- JJWT 0.9.0
- Lombok
- Spring Boot DevTools

---

## Learning Outcomes

- Spring Security Fundamentals
- HTTP Basic Authentication
- In-Memory Authentication
- Role-Based Access Control
- JWT Authentication
- JWT Authorization
- Spring Security Filter Chain
- REST API Security
- Token-Based Authentication
- Secure RESTful Web Services

---

## Future Enhancements

- Database-based Authentication using Spring Data JPA
- Refresh Tokens
- User Registration
- Login API
- Role Management
- MySQL Integration
- OAuth2 Authentication
- Spring Security with JWT using Spring Boot 3.x Best Practices

---

## Author

**Himabindu Mallula**

B.Tech – Electronics and Communication Engineering (ECE)

Institute of Aeronautical Engineering (IARE)

---

## Course

**Cognizant Digital Nurture 5.0**

Spring REST using Spring Boot – Spring Security & JWT Authentication