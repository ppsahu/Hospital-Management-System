## 📁 Hospital-Management-System

-- Hospital Management System built with Java and Spring Boot

-- A simple yet comprehensive hospital management system developed using Java and Spring Boot. It provides RESTful APIs to manage patient, doctor, appointment, and billing data, and includes built-in support for pagination and system health monitoring via Spring Boot Actuators.

## 📌 Features

This application includes the following functionalities:

✅ Patient Management

-- Add new patients

-- Update patient details

-- Delete patient records

-- Retrieve patient information (with pagination support)

✅ Doctor Management

-- Add new doctors

-- Update doctor details

-- Delete doctor records

-- Retrieve doctor information (with pagination support)

✅ Appointment Management

-- Schedule appointments

-- Modify appointment details

-- Cancel appointments

-- Retrieve appointment list (with pagination)

✅ Billing System

-- Generate bills for patients

-- Update or correct billing information

-- Delete billing records

-- View bills (with pagination)

✅ RESTful APIs

-- All operations are exposed via clean and intuitive REST APIs.

-- Follows best practices for resource-based URIs and HTTP methods.

✅ Pagination Support

-- Pagination is enabled on list endpoints to handle large datasets efficiently.

-- Supports customizable page number and size parameters.

✅ Spring Boot Actuators

-- Exposes health and metrics endpoints to monitor application health and behaviour.

-- Useful for DevOps and cloud deployment monitoring.

## 🚀 Getting Started

-- Follow the steps below to run this project on your local machine.

## 🔧 Prerequisites

-- Java 17 or above

## 📥 Clone the Repository

-- Run -> git clone https://github.com/ppsahu/Hospital-Management-System.git

-- Run -> cd Hospital-Management-System

-- Run the HmsApplication.java

-- Go to Postman or any API Client 

-- Hit "http://localhost:8080/api/v1/patients" with the GET method, make sure you get a 200 OK status

-- Add the data by hitting "http://localhost:8080/api/v1/patients" with the POST method

-- Example -> {
                  "name": "Reina",
                  "gender": "female",
                  "age": 30
              }

## 📂 Project Structure

-- controller/ – API layer

-- service/ – Business logic layer

-- repository/ – Data access layer

-- model/ – Entity classes

## 🙌 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

