# Exercise 2 – Load Balancing in API Gateway

## Objective

Implement client-side load balancing using Spring Cloud Gateway and Spring Cloud LoadBalancer.

---

## Business Scenario

In a microservices environment, multiple instances of a service may be running simultaneously. Spring Cloud LoadBalancer enables the API Gateway to distribute incoming requests across available service instances, improving scalability and reliability.

---

## Technologies Used

- Java 17
- Spring Boot 4.1.0
- Spring Cloud Gateway
- Spring Cloud LoadBalancer
- Spring WebFlux
- Maven

---

## Project Structure

```
loadbalancer-gateway
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── loadbalancer
│   │   │               └── LoadBalancerGatewayApplication.java
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
- Spring Cloud LoadBalancer

---

## Application Configuration

```properties
server.port=8084

spring.application.name=gateway

spring.cloud.gateway.routes[0].id=load_balanced_route
spring.cloud.gateway.routes[0].uri=lb://example-service
spring.cloud.gateway.routes[0].predicates[0]=Path=/loadbalanced/**
```

---

## How It Works

- The API Gateway receives client requests.
- Requests matching `/loadbalanced/**` are forwarded using the `lb://` protocol.
- Spring Cloud LoadBalancer attempts to locate an available instance of `example-service`.
- Since no service registry (such as Eureka) is configured in this exercise, the gateway returns a service unavailable response, demonstrating the load-balancing behavior.

---

## Running the Application

```bash
.\mvnw.cmd spring-boot:run
```

Application URL

```
http://localhost:8084
```

---

## Testing

Open

```
http://localhost:8084/loadbalanced/test
```

### Expected Output

Because no service named `example-service` is registered, the gateway returns a **503 Service Unavailable** (or a similar "No servers available" message). This confirms that the gateway attempted client-side load balancing.

---

## Learning Outcomes

- Spring Cloud Gateway
- Spring Cloud LoadBalancer
- Client-side Load Balancing
- API Gateway Routing
- Route Configuration using `application.properties`

---

## Conclusion

This exercise demonstrates how Spring Cloud Gateway integrates with Spring Cloud LoadBalancer to distribute requests among service instances. In a production environment, the target service would typically be registered using a service discovery mechanism such as Eureka or Consul.

---

## Author

**Himabindu Mallula**

Digital Nurture 5.0  
Microservices with Spring Boot 3 & Spring Cloud  
Cognizant Deep Skilling Program