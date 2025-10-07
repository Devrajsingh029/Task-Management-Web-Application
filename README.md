# Task-Management-Web-Application

📌 Introduction

Task Management System is a backend application built with Java Spring Boot that enables users to register, log in, manage personal tasks, and perform CRUD operations. Admins have extended access to manage users and tasks system-wide.
This project is ideal for understanding RESTful API development using Spring Boot, database integration, and secure authentication.

💻 Technologies Used

Framework: Spring Boot
Language: Java
Database: MySQL
ORM: Hibernate / JPA
Build Tool: Maven
Security: Token-based Authentication

✨ Features
User Authentication:
Sign up, Sign in, and Sign out using secure credentials.
Passwords are hashed before storing.

Admin Panel:
Admins can manage all users and tasks.
Secure access with admin-level authentication.

Task Management:
Create, update, delete tasks.
Mark tasks as done/undone.
View task list with pagination.

✅ Prerequisites

Before running the project, make sure you have:
Java JDK (11 or above)
MySQL installed and running
Maven installed

⚙️ Installation

Clone the Repository
git clone https://github.com/yourusername/task-management-api.git
cd task-management-api

Configure the Database
Update your MySQL connection settings in src/main/resources/application.properties.
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

Build and Run the Application
mvn clean install
mvn spring-boot:run

🧪 Usage
Use API tools like Postman to interact with endpoints. For authentication-required requests, include the generated token in the request header.

📡 API Endpoints

🔐 User Authentication
Endpoint	Method	Description
/user/signUp	POST	Register a new user
/user/signIn	POST	Login and receive auth token
/user/signOut	POST	Logout user

📋 Task Management
Endpoint	Method	Description
/task/add	POST	Add new task
/task/done	POST	Mark task as done
/task/undone	DELETE	Delete task (admin/user)
/task/todo	GET	View all tasks of a user
/task/update	PUT	Update task details
/task/taskId/pagination	POST	Paginated task list for a user

🛠️ Admin Management
Endpoint	Method	Description
/admin/signUp	POST	Register a new admin
/admin/signIn	POST	Login as admin
/admin/signOut	POST	Logout admin

🧩 Database Design
User Table: Stores user info (name, email, password)
Admin Table: Stores admin credentials
Task Table: Contains task name, status, timestamps, linked to user
AuthenticationToken Table: Stores session tokens for users/admins

🔐 Security

Authentication: 
Implemented via custom AuthenticationToken. Token is generated at login and passed in headers for authorized API calls.

Password Hashing: 
Passwords are securely hashed before storing using standard encoding mechanisms.



