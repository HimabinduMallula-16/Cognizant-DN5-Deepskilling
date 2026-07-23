# Spring Data JPA & Hibernate - Employee Management System

This repository contains the hands-on exercises completed as part of the **Spring Data JPA & Hibernate** module in the **Cognizant Digital Nurture 5.0** program.

The projects demonstrate the implementation of Spring Data JPA, Hibernate ORM, RESTful APIs, pagination, auditing, projections, multiple data sources, and Hibernate-specific features using Java and Spring Boot.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Maven
- Lombok
- REST API
- VS Code

---

## Project Structure

```
Spring Data JPA

├── Exercise01-ProjectSetup
├── Exercise02-Entities
├── Exercise03-Repositories
├── Exercise04-CRUD
├── Exercise05-QueryMethods
├── Exercise06-PaginationSorting
├── Exercise07-EntityAuditing
├── Exercise08-Projections
├── Exercise09-MultipleDataSources
└── Exercise10-HibernateFeatures
```

---

# Exercises

## Exercise 1 – Project Setup

### Objective
Create a Spring Boot project with Spring Data JPA.

### Topics Covered
- Spring Boot Project Creation
- Maven Configuration
- Spring Data JPA
- H2 Database
- Application Configuration

---

## Exercise 2 – Entity Mapping

### Objective
Create JPA entities and map them to database tables.

### Topics Covered
- Employee Entity
- Department Entity
- @Entity
- @Table
- @Id
- @GeneratedValue
- @OneToMany
- @ManyToOne

---

## Exercise 3 – Spring Data Repositories

### Objective
Create repositories using Spring Data JPA.

### Topics Covered
- JpaRepository
- CRUD Repository
- Derived Query Methods
- Repository Pattern

---

## Exercise 4 – CRUD Operations

### Objective
Implement CRUD operations using Spring Data JPA.

### Topics Covered
- Create Employee
- Read Employee
- Update Employee
- Delete Employee
- REST Controllers
- Service Layer

---

## Exercise 5 – Query Methods

### Objective
Implement custom queries using Spring Data JPA.

### Topics Covered
- Derived Query Methods
- @Query Annotation
- @NamedQuery
- @NamedQueries
- JPQL

---

## Exercise 6 – Pagination and Sorting

### Objective
Retrieve data using pagination and sorting.

### Topics Covered
- Pageable
- Page
- PageRequest
- Sort
- Pagination
- Sorting

---

## Exercise 7 – Entity Auditing

### Objective
Automatically track entity creation and modification.

### Topics Covered
- @EnableJpaAuditing
- @CreatedDate
- @LastModifiedDate
- @CreatedBy
- @LastModifiedBy
- AuditorAware

---

## Exercise 8 – Projections

### Objective
Retrieve only the required fields from entities.

### Topics Covered
- Interface-based Projection
- Class-based Projection (DTO)
- Constructor Expression
- @Query

---

## Exercise 9 – Multiple Data Sources

### Objective
Configure multiple databases in Spring Boot.

### Topics Covered
- Spring Boot Auto Configuration
- Primary Data Source
- Secondary Data Source
- @Primary
- @ConfigurationProperties
- DataSource Configuration

---

## Exercise 10 – Hibernate Features

### Objective
Implement Hibernate-specific features for improved performance.

### Topics Covered
- Hibernate Dialect
- @DynamicInsert
- @DynamicUpdate
- Batch Processing
- saveAll()
- Hibernate Properties

---

# REST APIs Implemented

- GET
- POST
- PUT
- DELETE

---

# Concepts Covered

- Spring Boot
- Spring Data JPA
- Hibernate ORM
- Entity Mapping
- Repository Pattern
- Service Layer
- RESTful Web Services
- CRUD Operations
- Query Methods
- JPQL
- Pagination
- Sorting
- Auditing
- Projections
- Multiple Data Sources
- Batch Processing

---

# Database

- H2 Database (In-Memory)

---

# Build Tool

- Maven

---

# IDE Used

- Visual Studio Code

---

# Author

**Himabindu Mallula**

GitHub: https://github.com/HimabinduMallula-16

---

# Learning Outcome

After completing these exercises, I gained practical experience in:

- Developing Spring Boot applications
- Working with Spring Data JPA repositories
- Mapping entity relationships using Hibernate
- Building RESTful CRUD APIs
- Writing custom and derived query methods
- Implementing pagination and sorting
- Enabling entity auditing
- Using interface and DTO projections
- Configuring multiple data sources
- Applying Hibernate performance optimization techniques

---