Task Management Web Application

A Task Management Web Application built using Spring Boot that provides RESTful APIs for managing tasks. The system allows users to create, update, track, and filter tasks while ensuring secure access using JWT authentication and role-based authorization.

This project demonstrates backend development skills using **Java, Spring Boot, Spring Security, Hibernate, and MySQL**, along with clean architecture and proper exception handling.



Features

* Create, update, and delete tasks

* Filter tasks based on status or criteria
  
* Track task progress and status
  
* Secure APIs using JWT Authentication
  
* Role-based access control with Spring Security
  
* Input validation for API requests
  
* Global exception handling for standardized API responses
  
* Unit testing with JUnit 5 and Mockito

Tech Stack

| Technology      | Purpose                        |
| --------------- | ------------------------------ |
| Java            | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring Security | Authentication & Authorization |
| JWT             | Secure API access              |
| Hibernate / JPA | ORM for database interaction   |
| MySQL           | Relational Database            |
| JUnit 5         | Unit Testing                   |
| Mockito         | Mocking framework for tests    |
| Maven           | Dependency Management          |


Project Architecture

The application follows a layered architecture:

Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
Database (MySQL)


* Controller → Handles REST API requests
  
* Service → Business logic
  
* Repository → Database operations using JPA/Hibernate
  
* Security Layer → JWT authentication and authorization



## Database Design

The application uses relational mappings with JPA annotations:

* OneToMany
* ManyToOne

These mappings help maintain **data consistency and relationships between entities**.

Example relationship:

```
User 1 --- * Tasks
```

---

## API Endpoints

### Authentication

| Method | Endpoint           | Description                        |
| ------ | ------------------ | ---------------------------------- |
| POST   | /api/auth/register | Register new user                  |
| POST   | /api/auth/login    | Authenticate user and generate JWT |

### Task Management

| Method | Endpoint                   | Description            |
| ------ | -------------------------- | ---------------------- |
| POST   | /api/tasks                 | Create a new task      |
| GET    | /api/tasks                 | Get all tasks          |
| GET    | /api/tasks/{id}            | Get task by ID         |
| PUT    | /api/tasks/{id}            | Update task            |
| DELETE | /api/tasks/{id}            | Delete task            |
| GET    | /api/tasks/status/{status} | Filter tasks by status |

---

## Security

The application uses **Spring Security with JWT**:

* Stateless authentication
* Token-based authorization
* Role-based access control
* Protected endpoints

Workflow:

```
User Login
   ↓
JWT Token Generated
   ↓
Token sent in Authorization Header
   ↓
Spring Security validates token
   ↓
Access granted to secured endpoints
```

---

## Exception Handling

A **Global Exception Handler** is implemented to provide consistent API responses.

Example response:

```json
{
  "timestamp": "2025-05-10T10:15:30",
  "status": 400,
  "error": "Validation Error",
  "message": "Task title cannot be empty"
}
```

---

## Testing

Unit tests are implemented for service layer components using:

* **JUnit 5**
* **Mockito**

This ensures:

* Business logic reliability
* Easier debugging
* Maintainable code

Run tests:

```bash
mvn test
```

---

## Setup and Installation

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/task-management-app.git
```

### 2. Navigate to project folder

```bash
cd task-management-app
```

### 3. Configure MySQL

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the application

```bash
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## Future Improvements

* Add frontend using **React or Angular**
* Implement task deadlines and reminders
* Add pagination and sorting
* Dockerize the application
* Deploy to cloud (AWS / Azure)

---

## Author

**Your Name**

If you like this project, feel free to ⭐ the repository.

---

If you want, I can also help you create a **much more impressive GitHub README with:**

* badges (build, Java version, Spring Boot)
* API request examples (Postman style)
* project screenshots
* folder structure section

This can make your **GitHub look much stronger for job applications.**
