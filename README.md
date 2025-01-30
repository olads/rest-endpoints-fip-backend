# Spring Boot REST API 

This is a simple Spring Boot application that demonstrates a REST API with six endpoints. The application does not interact with a database and focuses on basic operations like string manipulation, arithmetic, and simple logic.

## Table of Contents
1. [Endpoints](#endpoints)
2. [How It's Wired](#how-its-wired)
3. [Running the Application](#running-the-application)

---

## Endpoints

The API provides the following endpoints:

1. **GET `/api/greet`**
   - **Description**: Returns a greeting message.
   - **Example Request**: `GET /api/greet`
   - **Example Response**: `"Hello, welcome to the Spring Boot REST API!"`

2. **GET `/api/add`**
   - **Description**: Adds two numbers provided as query parameters.
   - **Parameters**:
     - `a` (integer): The first number.
     - `b` (integer): The second number.
   - **Example Request**: `GET /api/add?a=5&b=3`
   - **Example Response**: `8`

3. **GET `/api/isEven`**
   - **Description**: Checks if a number is even.
   - **Parameters**:
     - `number` (integer): The number to check.
   - **Example Request**: `GET /api/isEven?number=4`
   - **Example Response**: `true`

4. **GET `/api/reverse`**
   - **Description**: Reverses a string provided as a query parameter.
   - **Parameters**:
     - `input` (string): The string to reverse.
   - **Example Request**: `GET /api/reverse?input=hello`
   - **Example Response**: `"olleh"`

5. **GET `/api/length`**
   - **Description**: Returns the length of a string provided as a query parameter.
   - **Parameters**:
     - `input` (string): The string to measure.
   - **Example Request**: `GET /api/length?input=hello`
   - **Example Response**: `5`

6. **GET `/api/uppercase`**
   - **Description**: Converts a string to uppercase.
   - **Parameters**:
     - `input` (string): The string to convert.
   - **Example Request**: `GET /api/uppercase?input=hello`
   - **Example Response**: `"HELLO"`

---

## How It's Wired

The application follows a simple Spring Boot architecture with a **Controller-Service** pattern:

1. **Controller (`MyController`)**:
   - Handles incoming HTTP requests.
   - Maps each endpoint to a specific method.
   - Delegates business logic to the service layer.

2. **Service (`MyService`)**:
   - Contains the business logic for each operation.
   - Performs tasks like string manipulation, arithmetic, and checks.

3. **Dependency Injection**:
   - The `MyService` is injected into the `MyController` using Spring's `@Autowired` annotation.
   - This ensures loose coupling and makes the code easier to test and maintain.

---

## Running the Application

### Prerequisites
- Java 17 or higher
- Maven (for building the project)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name
