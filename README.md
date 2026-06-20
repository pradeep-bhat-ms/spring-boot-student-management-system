# Spring Boot Student Management System

## Project Description

This is a RESTful Student Management System developed using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

The application provides APIs to perform CRUD (Create, Read, Update, Delete) operations on student records.

---

## Features

* Add Multiple Students
* Fetch All Students
* Fetch Student By ID
* Update Student Details
* Delete Student By ID
* REST API Development
* MySQL Database Integration
* Spring Data JPA Repository

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman
* Eclipse IDE

---

## Concepts Used

* REST API
* Spring Boot
* Spring Data JPA
* Hibernate ORM
* CRUD Operations
* RequestBody
* PathVariable
* Repository Pattern
* Dependency Injection
* Lombok

---

## Project Structure

src/main/java

├── com.example.StudentManagementSpringBoot

│   ├── Controller

│   │   └── StudentController.java

│   ├── Entity

│   │   └── StudentEntity.java

│   ├── Repository

│   │   └── StudentRepository.java

│   └── StudentManagementSpringBootApplication.java

src/main/resources

└── application.properties

---

## Database

* MySQL Database
* Spring Data JPA
* Hibernate ORM
* Automatic Table Creation using JPA

---

## API Endpoints

### Add Students

POST /student/save

### Get All Students

GET /student/get

### Get Student By ID

GET /student/{id}

### Update Student

PUT /student/{id}

### Delete Student

DELETE /student/{id}

---

## Student Entity Fields

* id
* name
* email
* age
* course
* mobileno

---

## Testing Tool

* Postman

---

## Learning Outcomes

* Spring Boot Application Development
* REST API Development
* Spring Data JPA
* Hibernate ORM
* MySQL Integration
* CRUD Operations
* API Testing using Postman

---

## Future Enhancements

* Validation API
* Exception Handling
* Swagger Documentation
* Spring Security
* JWT Authentication
* Pagination and Sorting

---

## Author

Pradeep Bhat

