# User Registration System

## Challenge Objective
This project aims to create a **User Registration System** in Java, applying **Object-Oriented Programming (OOP)** concepts.  
The system allows you to add, list, edit, and delete users, with data persistence in a text file (`usuarios.txt`).  

This challenge is part of a Java study portfolio and will be expanded in the future with new features.

---

## Current Features
- Register users with a **unique ID**.
- List all registered users.
- Edit existing users.
- Delete users by ID.
- Data persistence in a **text file** (`.txt`) so information is not lost between executions.

---

## Technologies and OOP Concepts Used
- **Java** 11+  
- **OOP**:
  - **Classes and Objects**: `Usuario`, `UsuarioService`, `UsuarioRepository`  
  - **Encapsulation**: private attributes with getters and setters  
  - **Abstraction**: `UsuarioService` handles business logic without exposing storage details  
  - **Modularity**: separated into packages `model`, `service`, `repository`  

---

## 📂 Project Structure
Cad_Usuarios/
|
|-- src/
|    |-- cadastro/
|         |-- main.java
|         |-- model/
|         |    |-- Usuario.java
|         |-- service/
|         |    |-- UsuarioService.java
|         |-- repository/
|              |-- UsuarioRepository.java
|
|-- data/
     |-- usuarios.txt   (created automaticaly)


---

## How to Run
1. Open the project in VS Code.
2. Compile and run `Main.java`.
3. Interact with the terminal menu:
   - 1: Register user
   - 2: List users
   - 3: Edit user
   - 4: Delete user
   - 0: Exit

---

##  Notes
- The system ensures **no duplicate IDs**.
- Data is **automatically saved** to the file `data/usuarios.txt`.
- Future additions planned:
  - Email validation
  - User search
  - JSON or database persistence
  - Graphical or web interface

---

## Conclusion
This project demonstrates the practical application of **OOP in Java** and serves as a foundation for future improvements, keeping the code **modular, organized, and easy to maintain**.
