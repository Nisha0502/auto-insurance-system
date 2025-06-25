
# Auto Insurance Web Application

A simple Java web application built using JSP, Servlets, and JDBC to register insurance companies and perform basic login functionality.

---

## Features
- Admin login (static)
- Company registration form
- JSP and Servlets with MySQL backend
- Minimal clean structure for easy understanding

---

## Technologies Used
- Java, JSP, Servlets
- MySQL
- Apache Tomcat

---

  ## 📸 Screenshots

### 🔐 Login Page
![Login](screenshots/login.png)

### 📝 Register Page
![Register](screenshots/register.png)

### 📊 Dashboard
![Dashboard](screenshots/dashboard.png)

---

## Setup Instructions
1. Import the project into Eclipse/NetBeans or VS Code with Java plugin.
2. Set up MySQL with a database named `insurance` and a table `companies` with fields: name, email, policy.
3. Update DB credentials in `RegisterServlet.java` and `DBConnection.java` if needed.
4. Deploy using Tomcat server and run via browser.

---

## Folder Structure
- src/servlets: Backend servlet classes
- WebContent/: JSP files, dashboard, and forms
- web.xml: Servlet configuration

---

  ## 👩‍💻 Author
Nisha Chaudharay

