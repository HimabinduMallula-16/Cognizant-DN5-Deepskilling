# Exercise 1 - Centralized Authentication with OAuth2/OIDC

## Objective
Implement centralized authentication using OAuth 2.1/OpenID Connect (OIDC) in a Spring Boot 3 application.

---

## Business Scenario

Implement centralized authentication for a Spring Boot application using OAuth2/OIDC. The application authenticates users through an external Identity Provider (Google OAuth2) and displays the authenticated user's information.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Security
- OAuth2 Client
- Maven
- REST API

---

## Project Structure

```
centralized-auth
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── centralizedauth
│   │   │               ├── CentralizedAuthApplication.java
│   │   │               ├── config
│   │   │               │      └── SecurityConfig.java
│   │   │               └── controller
│   │   │                      └── UserController.java
│   │   │
│   │   └── resources
│   │          └── application.yml
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## Dependencies

- Spring Web
- Spring Security
- OAuth2 Client
- Lombok

---

## Configuration

OAuth2 client configuration is defined in:

```
src/main/resources/application.yml
```

Example:

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_CLIENT_ID
            client-secret: YOUR_CLIENT_SECRET
            scope:
              - openid
              - profile
              - email
```

> Replace `YOUR_CLIENT_ID` and `YOUR_CLIENT_SECRET` with valid Google OAuth credentials if authentication needs to be tested.

---

## REST Endpoint

### Get Authenticated User

```
GET /user
```

Returns the authenticated user's details after successful login.

---

## Security Configuration

The application uses Spring Security's `SecurityFilterChain` to:

- Authenticate all incoming requests
- Redirect users to Google OAuth Login
- Allow only authenticated users to access protected endpoints

---

## Running the Application

### Using Maven Wrapper

Windows

```bash
.\mvnw.cmd spring-boot:run
```

Linux / Mac

```bash
./mvnw spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

## Testing

Open:

```
http://localhost:8080/user
```

Expected Behavior:

- Redirects to Google Login
- After successful authentication, displays authenticated user information

> If placeholder OAuth credentials are used, Google returns **401 - invalid_client**, which is expected until valid credentials are configured.

---

## Learning Outcomes

- Spring Security Configuration
- OAuth2 Client Configuration
- OpenID Connect (OIDC)
- SecurityFilterChain
- REST Controller Security
- External Authentication using Google OAuth2

---

## Author

**Himabindu Mallula**

Digital Nurture 5.0 – Microservices with Spring Boot 3 & Spring Cloud