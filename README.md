# Simple-CRUD-Employee-App

A very basic CRUD (Create, Read, Update, Delete) application built with **Spring Boot** and **Thymeleaf** for managing employee records.

---

## Technologies
- **Backend**: Spring Boot 3.x
- **Frontend**: Thymeleaf, HTML, Bootstrap
- **Database**: MySQL
- **Dependencies**: Lombok, Spring Data JPA, Spring Web, Thymeleaf, Spring Boot Devtools
- **Tools**: Maven

---

## Installation
1. **Prerequisites**:
   - Java 17+
   - Maven
   - MySQL Server
   - IDE (IntelliJ, Eclipse, etc.)

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/LyotardPostmodernizm/Simple-CRUD-Employee-App
   
   cd Simple-CRUD-Employee-App
   ```
 3. **Database Setup**:

Create a MySQL database named **simple_employees**.

Update **application.properties** with your MySQL credentials:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/simple_employees
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
4. **Run the Application**:
   
   ```bash
   mvn spring-boot:run
   ```
   The app will be accessible at **http://localhost:8080**

## Endpoints:
- **Employee List**: ``` GET /employees/list ```

- **Add Employee Form**: ``` GET /employees/add ```

- **Save Employee**: ``` POST /employees/save ```

- **Update Employee**: ``` GET /employees/update?id={id} ```

- **Delete Employee**: ``` GET /employees/delete?id={id} ```

## Screenshots:



