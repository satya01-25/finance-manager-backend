# Finance Manager (Spring Boot Backend)

A RESTful backend for managing personal and family finances. Features include:
- Multi-user support (personal/family)
- Expense tracking
- Income logging
- Budgeting
- Reporting
- Bank account integration (stub for now)
- Oracle Database backend

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security
- Maven
- Oracle Database (JPA/Hibernate)

## Getting Started

1. Configure your Oracle DB connection in `src/main/resources/application.properties`.
2. Build using Maven: `mvn clean install`
3. Run: `mvn spring-boot:run`

## API Overview

All endpoints are RESTful. See the code for details.

## Frontend

Connect your preferred frontend (React, Angular, etc.) via REST API.