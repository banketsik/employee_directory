## About this Project:

A robust Spring Boot REST API designed for managing employee records. This project implements a full CRUD (Create, Read, Update, Delete) workflow using Spring Data JPA/Hibernate and MySQL. It follows a standard n-tier architecture to ensure clean separation of concerns.

## Features

- Register New Employee: Add new staff members to the database.
- Search & View: Retrieve individual employee details or a complete directory list.
- Update Records: Modify existing employee information dynamically.
- Remove Employee: Delete specific employee records from the system

## Tech Stack

**Backend:** [![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white)](#) 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)](#)

**Database:** [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-ffffff?style=flat-square&logo=postgresql&logoColor=336791)](#)

**Build Tool:** [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-ffffff.svg?style=flat-square&logo=intellij-idea&logoColor=black)](#)

**Frontend:** [![HTML5](https://img.shields.io/badge/HTML5-%23E34F26.svg?style=flat-square&logo=html5&logoColor=white)](#)


## Demo

![preview](https://github.com/user-attachments/assets/52f10d1e-0705-4b7c-acf0-4bac31eff738)

## File Structure

```
├───.idea
├───.mvn
│   └───wrapper
├───sql-scripts
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───crudapi
│   │   │           └───springboot
│   │   │               └───cruddemo
│   │   │                   ├───controller
│   │   │                   ├───dao
│   │   │                   ├───entity
│   │   │                   └───service
│   │   └───resources
│   │       ├───static
│   │       └───templates
│   │           └───employees
│   └───test
│       └───java
│           └───com
│               └───crudapi
│                   └───springboot
│                       └───cruddemo
└───target
    ├───classes
    │   ├───com
    │   │   └───crudapi
    │   │       └───springboot
    │   │           └───cruddemo
    │   │               ├───controller
    │   │               ├───dao
    │   │               ├───entity
    │   │               └───service
    │   ├───static
    │   └───templates
    │       └───employees
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        └───com
            └───crudapi
                └───springboot
                    └───cruddemo
```

## Installation

1. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
2. Initialize the Database (Docker)
   ```sh
   docker run --name employee_directory \
   -e POSTGRES_DB=employeedb \
   -e POSTGRES_USER=root \
   -e POSTGRES_PASSWORD=root \
   -p 3307:5432 \
   -d postgres
   ```
3. Navigate to Project Directory
   ```sh
   cd <project-name>
   ```
4. Open VS Code from terminal
   ```sh
   code .
   ```
5. Start up Live server

## License

Distributed under the MIT License. See `LICENSE` for more information.
