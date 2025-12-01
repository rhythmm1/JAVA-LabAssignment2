# Student Management System

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Command line terminal (Command Prompt, PowerShell, or Bash)

## Project Structure
```
Lab Assignment No.2/
└── src/
    ├── Main.java
    ├── model/
    │   ├── Person.java (Abstract Class)
    │   └── Student.java (Concrete Class - Final)
    └── service/
        ├── RecordActions.java (Interface)
        └── StudentManager.java (Implementation)
```

## How to Run the Code

### Step 1: Navigate to the src directory
```bash
cd "Lab Assignment No.2/src"
```

### Step 2: Compile all Java files
```bash
javac Main.java model/*.java service/*.java
```

### Step 3: Run the program
```bash
java Main
```

### Alternative: Compile and Run in One Line
```bash
cd src && javac Main.java model/*.java service/*.java && java Main
```

## Expected Output
```
Student added successfully!
Student added successfully!
Student Info:
Roll No: 101
Name: Rhythm
Email: rhythm@mail.com
Course: B.Tech

Student Info:
Roll No: 102
Name: Vishu
Email: Vishu@mail.com
Course: M.Tech

[Note] Overloaded display method:
Student Info:
Roll No: 101
Name: Rhythm
Email: rhythm@mail.com
Course: B.Tech
This is a final method in a final class.

Attempting to add duplicate student:
Error: Student with Roll No 101 already exists!

Searching for student with Roll No 102:
Student Info:
Roll No: 102
Name: Vishu
Email: vishu@mail.com
Course: M.Tech

Sorting students...
Students sorted by Roll No.
Finalize method called before object is garbage collected
```

## OOP Concepts Demonstrated

### 1. Inheritance
- `Student` extends abstract class `Person`
- Inherits `name` and `email` fields

### 2. Abstract Class
- `Person` is abstract with abstract method `displayInfo()`
- Forces subclasses to implement the method

### 3. Interface
- `RecordActions` interface defines CRUD operations
- `StudentManager` implements all interface methods

### 4. Method Overriding
- `Student.displayInfo()` overrides abstract method from `Person`
- Demonstrates runtime polymorphism

### 5. Method Overloading
- `Student.displayInfo()` - no parameters
- `Student.displayInfo(boolean)` - with parameter
- Demonstrates compile-time polymorphism

### 6. Final Class and Method
- `Student` class is final (cannot be extended)
- `displayInfo(boolean)` is final (cannot be overridden)

### 7. Polymorphism
- Static: Method overloading in Student class
- Dynamic: Method overriding, interface implementation

### 8. Data Structures
- `Map<Integer, Student>` for efficient lookup by rollNo
- `List<Student>` for maintaining order and iteration
- Prevents duplicate roll numbers

## Features
- Add students with duplicate prevention
- Delete students by roll number
- Update student records
- Search students by roll number
- View all students
- Sort students by roll number

## Troubleshooting

### If you get "javac: command not found"
- Ensure JDK is installed: Download from https://www.oracle.com/java/technologies/downloads/
- Add Java to your PATH environment variable

### If you get "class not found" error
- Make sure you're in the `src` directory when running the program
- Ensure all files compiled successfully without errors
# Student-Management-System
