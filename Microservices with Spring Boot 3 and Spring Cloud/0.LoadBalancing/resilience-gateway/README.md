# Exercise 3 – Resilience Patterns in an API Gateway

## Objective

Implement resilience patterns in an API Gateway using Spring Boot and Spring Cloud with Resilience4j. The application demonstrates Circuit Breaker and Time Limiter configurations to improve the reliability and fault tolerance of microservices.

---

## Business Scenario

In a microservices architecture, failures in one service should not affect the entire system. Resilience4j provides resilience mechanisms such as Circuit Breaker and Time Limiter to handle service failures gracefully and improve application availability.

This exercise demonstrates how to configure Resilience4j in a Spring Cloud Gateway application.

---

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring Cloud Gateway
- Spring Cloud Circuit Breaker
- Resilience4j
- Spring Boot Actuator
- Maven

---

## Project Structure

```
resilience-gateway
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── resilience
│   │   │               ├── ResilienceGatewayApplication.java
│   │   │               ├── controller
│   │   │               │      └── TestController.java
│   │   │               └── config
│   │   │                      └── ResilienceConfiguration.java
│   │   │
│   │   └── resources
│   │          └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

## Dependencies

- Spring Boot Starter Web
- Spring Cloud Gateway
- Spring Cloud Circuit Breaker (Resilience4j)
- Spring Boot Actuator

---

## Application Configuration

`application.properties`

```properties
server.port=8085

spring.application.name=resilience-gateway

resilience4j.circuitbreaker.instances.exampleCircuitBreaker.registerHealthIndicator=true
resilience4j.circuitbreaker.instances.exampleCircuitBreaker.slidingWindowSize=10
resilience4j.circuitbreaker.instances.exampleCircuitBreaker.failureRateThreshold=50

management.endpoints.web.exposure.include=*
```

---

## Components

### ResilienceConfiguration

Configures the default Circuit Breaker and Time Limiter using Resilience4j.

### TestController

Provides a simple REST endpoint to verify that the application is running.

Endpoint:

```
GET /test
```

Response:

```
Resilience Gateway Working
```

---

## Running the Application

Windows

```bash
.\mvnw.cmd spring-boot:run
```

Application runs on:

```
http://localhost:8085
```

---

## Testing

Open the browser and navigate to:

```
http://localhost:8085/test
```

Expected Output

```
Resilience Gateway Working
```

---

## Learning Outcomes

- Spring Cloud Gateway
- Resilience4j Integration
- Circuit Breaker Pattern
- Time Limiter Pattern
- Fault Tolerance in Microservices
- Spring Boot Configuration

---

## Conclusion

This project demonstrates how resilience patterns can be implemented in an API Gateway using Spring Cloud and Resilience4j. Circuit Breaker and Time Limiter configurations help improve application reliability by preventing cascading failures and improving service availability.

---

## Author

**Himabindu Mallula**

Digital Nurture 5.0  
Microservices with Spring Boot 3 & Spring Cloud  
Cognizant Deep Skilling Program