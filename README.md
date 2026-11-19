# SpringBoot-CRUD-Task
Spring Boot CRUD Operation
# Spring Boot Employee CRUD Application

# Project Overview
This project is a Spring Boot-based Employee Management application that performs CRUD (Create, Read, Update, Delete) operations.

It allows users to add, retrieve, update and delete employee records. It also supports retrieving employees based on their department.

# Technologies Used
- Java
- Spring Boot
- Maven
- Spring Web

# CRUD Functionalities

1. Create Employee: Add new employee details.
2. Read Employees: Retrieve all employee records.
3. Get Employee by ID: Retrieve a particular employee using their ID.
4. Update Employee: Modify existing employee details.
5. Delete Employee: Delete an employee using their ID.
6. Filter by Department: Retrieve employees belonging to a specific department.

## Project Structure

- Controller – Handles HTTP requests and API endpoints.
- Services – Handles business logic.
- Entity – Represents employee data.

## API Endpoints

**|    Operation       | HTTP Method |     Endpoint    |**

  | Add Employee       |   POST      | /employees      |
  | Get All Employees  |   GET       | /employees      |
  | Get Employee by ID |   GET       | /employees/{id} |
  | Update Employee    |   PUT       | /employees      |
  | Delete Employee    |   DELETE    | /employees/{id} |
  | Get Employees by   |   GET       | /employees/department/{department} |
    Department 

## To Run the Application

1. Clone the repository.
2. Import the project into Eclipse or Spring Tool Suite.
3. Configure the database connection if required.
4. Update Maven dependencies.
5. Run the Spring Boot application.
6. Test the API endpoints using Postman.

## Author
Anitha Raja
