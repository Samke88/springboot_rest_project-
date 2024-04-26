# Spring Boot REST Project for Waste Sorting Mobile Application

## Overview
This Spring Boot application serves as the backend for a waste sorting mobile application. It provides RESTful APIs for communication with the frontend, enabling users to access waste category information, disposal guidelines, and recycling tips.

## Features
- RESTful APIs: Exposes endpoints for CRUD operations on waste categories, disposal guidelines, and recycling tips.
- Input Validation: Ensures data integrity and validity using Spring Boot validation annotations.
- H2 In-Memory Database: Utilizes an in memory database for data storage during development.
- Clean Architecture: Follows best practices for structuring the project and implementing separation of concerns.

## Setup
1. Clone the Repository: `git clone <repository-url>`
2. Navigate to the Project Directory**: `cd waste-sorting-app`
3. Run the Application: `mvn spring-boot:run`
4. Access the APIs: Open a web browser or use tools like Postman to interact with the endpoints.

## Endpoints
- GET /waste-categories: Retrieves all waste categories.
- GET /waste-categories/{id}: Retrieves a specific waste category by ID.
- POST /waste-categories: Creates a new waste category.
- PUT /waste-categories/{id}: Updates an existing waste category.
- DELETE /waste-categories/{id}: Deletes a waste category.
  

## Technologies Used
- Java
- Spring Boot
- Spring MVC
- H2 Database
- Maven

