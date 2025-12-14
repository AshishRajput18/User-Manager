User Management System
Overview

This project is a User Management System developed using Java and Spring Boot with MySQL as the database. It provides RESTful APIs to manage users and demonstrates basic backend development concepts such as CRUD operations, validation, and exception handling.

Project Objective

The main objective of this project is to understand how to:

Build REST APIs using Spring Boot

Perform database operations using Spring Data JPA

Apply backend input validation

Handle errors in a clean and structured way

Functional Requirements

List all users

Add a new user with name, email, and age

Edit an existing user

Delete a user

Display validation error messages

Technologies Used

Java

Spring Boot

Spring Data JPA

MySQL

Hibernate

Maven

Postman

Application Architecture

The project follows a layered architecture:

Controller Layer: Handles HTTP requests and responses

Service Layer: Contains business logic

Repository Layer: Manages database interactions

Entity Layer: Represents database tables

Validation & Error Handling

Backend validation ensures that invalid data is not saved

Validation rules are applied for name, email, and age

Global exception handling is used to return meaningful error messages

API Testing

All APIs are tested using Postman to verify request handling, validation, and responses.

Use Cases

Learning Spring Boot REST API development

Practicing CRUD operations with MySQL

Preparing for Java backend interviews

Conclusion

This project serves as a beginner-to-intermediate level example of building a RESTful backend application using Spring Boot and MySQL while following best practices.
