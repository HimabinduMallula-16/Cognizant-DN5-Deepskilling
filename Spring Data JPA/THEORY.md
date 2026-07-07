# Spring Data JPA & Hibernate Theory

## Spring Data JPA

Spring Data JPA simplifies database access by reducing boilerplate code.

Advantages

- Easy CRUD operations
- Repository support
- Pagination
- Sorting
- Query Methods
- Custom Queries

---

## Hibernate

Hibernate is an Object Relational Mapping (ORM) framework.

Features

- Automatic Table Mapping
- Caching
- Lazy Loading
- Transaction Management

---

## HQL

Hibernate Query Language works with entity classes instead of database tables.

Example

SELECT e FROM Employee e

---

## JPQL

Java Persistence Query Language is similar to HQL and works on entity objects.

Example

SELECT e FROM Employee e WHERE e.salary > 50000

---

## Native Query

Native Query uses SQL statements directly.

Example

SELECT * FROM employee

---

## Criteria API

Criteria API is used for creating dynamic queries programmatically.

Advantages

- Type Safe
- Dynamic Queries
- Flexible

---

## Entity Relationships

One-To-One

One-To-Many

Many-To-One

Many-To-Many

---

## Repository

JpaRepository provides

- Save
- Find
- Delete
- Update
- Pagination
- Sorting

without writing SQL.
