# Exercise 1 – Edge Services for Routing and Filtering

## Objective

Implement an API Gateway using Spring Cloud Gateway to route incoming requests and apply a custom global logging filter.

---

## Business Scenario

In a microservices architecture, an API Gateway acts as the single entry point for all client requests. It routes requests to the appropriate microservice and can apply common functionalities such as logging, authentication, filtering, and monitoring.

This exercise demonstrates routing requests through Spring Cloud Gateway and implementing a custom global filter to log incoming requests.

---

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring Cloud Gateway
- Spring WebFlux
- Maven

---

## Project Structure

```
edge-services-gateway
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── gateway
│   │   │               ├── EdgeServicesGatewayApplication.java
│   │   │               └── filter
│   │   │                     └── LoggingFilter.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

## Dependencies

- Spring Boot Starter WebFlux
- Spring Cloud Gateway

---

## Gateway Configuration

```properties
server.port=8080

spring.cloud.gateway.routes[0].id=example_route
spring.cloud.gateway.routes[0].uri=http://example.org
spring.cloud.gateway.routes[0].predicates[0]=Path=/example/**
```

---

## Custom Global Filter

The LoggingFilter logs every incoming request URI before forwarding it to the target service.

Example log:

```
Request: http://localhost:8080/example/test
```

---

## Running the Application

```bash
.\mvnw.cmd spring-boot:run
```

Application URL

```
http://localhost:8080
```

---

## Testing

Open

```
http://localhost:8080/example/test
```

Expected Result

- Request is routed to the configured destination.
- Request URI is logged in the console.

---

## Learning Outcomes

- Spring Cloud Gateway
- API Gateway Routing
- Global Filters
- Request Logging
- Reactive Gateway Architecture

---

## Author

**Himabindu Mallula**

Digital Nurture 5.0  
Microservices with Spring Boot 3 & Spring Cloud  
Cognizant Deep Skilling Program