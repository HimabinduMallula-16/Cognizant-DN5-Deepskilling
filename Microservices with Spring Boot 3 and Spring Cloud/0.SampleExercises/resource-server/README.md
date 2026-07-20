# Exercise 2 – Configuring Resource Server

## Objective
Configure a Spring Boot application as an OAuth2 Resource Server.

## Technologies
- Java 17
- Spring Boot 3.5.16
- Spring Security
- OAuth2 Resource Server
- Maven

## Endpoint

GET /secure

## Expected Output

Without JWT:

401 Unauthorized

With Valid JWT:

This is a secure endpoint

## Project Structure

- ResourceServerConfig
- SecureController
- application.yml