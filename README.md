# 📋 Task Management REST API

A secure, role-based REST API for managing tasks — built with Spring Boot, 
JWT Authentication, and MySQL.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot 3.x |
| Security | Spring Security + JWT |
| ORM | Hibernate / Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| Deployment | Render |

---

## ✨ Features

- ✅ JWT-based Authentication (Login / Register)
- ✅ Role-Based Access Control (USER / ADMIN)
- ✅ Full Task CRUD — create, update, delete, view
- ✅ Filter tasks by **status** and **priority**
- ✅ Centralized Exception Handling with standard error responses
- ✅ JPA Relational Mapping across 4 MySQL tables

---

## 🗂️ Project Structure

src/
├── controller/      → REST endpoints
├── service/         → Business logic
├── repository/      → DB layer (JPA)
├── model/           → Entities
├── security/        → JWT + Spring Security config
└── exception/       → Global exception handler

---

## 📡 API Endpoints

| Method | Endpoint | Access | Description |
|---|---|---|---|
| POST | /api/auth/register | Public | Register new user |
| POST | /api/auth/login | Public | Get JWT token |
| GET | /api/tasks | USER, ADMIN | Get all tasks |
| POST | /api/tasks | USER | Create task |
| PUT | /api/tasks/{id} | USER | Update task |
| DELETE | /api/tasks/{id} | ADMIN | Delete task |
| GET | /api/tasks/filter | USER | Filter by priority/status |

---

## 🗃️ Database Schema

**Users** → OneToMany → **Tasks**  
**Tasks** → ManyToOne → **Users**  
(4 related tables with foreign key constraints)

---

## 🔐 Security Flow

1. User registers → password stored as BCrypt hash
2. User logs in → server returns signed JWT token
3. All subsequent requests include `Authorization: Bearer <token>`
4. Spring Security filter validates token on every request
5. RBAC enforces what each role can access

---

## ⚙️ How to Run Locally

```bash
# Clone the repo
git clone https://github.com/Devrajsingh029/task-management-api

# Configure DB in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=yourpassword

# Run
mvn spring-boot:run
```

---

## 👤 Author
**Devraj Singh** — [LinkedIn](https://linkedin.com/in/devraj-singh01) | [GitHub](https://github.com/Devrajsingh029)
