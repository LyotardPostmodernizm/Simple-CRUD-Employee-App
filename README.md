# Simple CRUD Employee App

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
![Image1](https://github.com/user-attachments/assets/f9603163-c829-4530-bb53-4c823e0faf30)
![Image2](https://github.com/user-attachments/assets/6fd7574b-921f-49ad-acf6-16d5ab12327b)
![Image3](https://github.com/user-attachments/assets/10085e72-2f36-4f4b-87aa-9749f134947d)
![Image4](https://github.com/user-attachments/assets/c1a0604b-5f4a-4291-a2fa-ef346baa9a37)



