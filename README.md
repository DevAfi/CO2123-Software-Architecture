# Software Architecture and System Development (SASD)

This repository contains the laboratory exercises for the Software Architecture and System Development module (CO2123) - a second-year Computer Science course.

## Overview

This module covers fundamental concepts in software architecture, system design, and development practices. The labs provide hands-on experience with modern software development tools and frameworks.

## Lab Structure

### Semester 1

#### Lab 1 - Introduction to Spring Framework
- **Lab 1A** (`Labs/semester_1/lab1_exa/`): Basic Spring Boot application with MVC controller
- **Lab 1B** (`Labs/semester_1/lab1_exb/`): Date controller with JSP views

#### Lab 2 - Model-View-Controller Architecture
- **Lab 2** (`Labs/semester_1/lab2_ex/`): Pet management system demonstrating MVC patterns with models and views

#### Lab 3 - Advanced MVC with Data Relationships
- **Lab 3** (`Labs/semester_1/lab3_ex/`): Fitness tracking application with Goals and Exercises, showcasing object relationships and data management

#### Lab 4 - Form Validation and Data Binding
- **Lab 4** (`Labs/semester_1/lab4_ex/`): Comprehensive application combining pet management and fitness tracking with custom form validation and data binding

### Semester 2

#### Lab 1 - User Authentication with Spring Security
- **Lab 1** (`Labs/semester_2/Lab1/`): User registration and login system using Spring Security, JSP views, and a MySQL-backed `User` entity. Covers password hashing, custom `UserDetailsService`, and securing routes with a security filter chain.

#### Lab 2 - Admin Seeding and Role Management
- **Lab 2** (`Labs/semester_2/Lab2/`): Extends the authentication system by seeding an admin user on application startup and managing user roles. Demonstrates using `CommandLineRunner` to initialise data and reinforces secure authentication and authorisation concepts.

## Technologies Used

- **Java** - Programming language
- **Spring Boot** - Application framework
- **Spring MVC** - Web framework
- **Spring Security** - Authentication and authorization
- **JSP** - JavaServer Pages for view templates
- **MySQL** - Relational database for persistence
- **Gradle** - Build automation tool
- **Maven** - Dependency management

## Getting Started

Each lab is a standalone Spring Boot application. To run any lab:

1. Navigate to the specific lab directory
2. Run `./gradlew bootRun` (Linux/Mac) or `gradlew.bat bootRun` (Windows)
3. Access the application through your web browser

## Lab Descriptions

### Lab 1A - Basic Spring Application
Simple greeting application demonstrating basic Spring Boot setup and controller functionality.

### Lab 1B - Date Display Application
Application that displays the current date using Spring MVC with JSP templates.

### Lab 2 - Pet Management System
A more comprehensive application showcasing MVC architecture with model classes, controllers, and JSP views for managing pet information.

### Lab 3 - Fitness Tracking Application
An advanced MVC application demonstrating object relationships and data management. Features a fitness tracking system where users can create goals and add exercises to track their fitness activities. Shows how to handle one-to-many relationships between Goals and Exercises.

### Lab 4 - Form Validation and Data Binding Application
A comprehensive Spring MVC application that combines pet management and fitness tracking functionality. Demonstrates advanced form validation using custom validators, data binding with `@ModelAttribute`, and error handling with `BindingResult`. Features include:
- Pet registration with species validation and food restrictions
- Fitness goal management with exercise tracking
- Custom validation logic preventing pets from eating other pets
- Form error handling and user feedback
- Integration of multiple domain models (Pet, Goal, Exercise) in a single application

## Learning Objectives

Through these labs, students will learn:
- Spring Boot application structure and configuration
- MVC (Model-View-Controller) architectural pattern
- Web application development with Spring MVC
- JSP template integration
- Build tool usage with Gradle
- Basic web development concepts
- Object relationships and data modeling
- Form handling and data binding
- Application state management
- Custom form validation and error handling
- Data binding with `@ModelAttribute` and `BindingResult`
- Spring validation framework and custom validators
- Persistence with JPA and MySQL
- User authentication flows with Spring Security
- Role-based access control and secure route configuration

## Information

- **Year**: Second Year Computer Science
- **Focus**: Software Architecture and System Development
