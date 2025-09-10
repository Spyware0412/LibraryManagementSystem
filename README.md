📚 Library Management System (Java OOP)

A simple Library Management System implemented in Java using Object-Oriented Programming (OOP) principles.
This project demonstrates Encapsulation, Inheritance, Polymorphism, and Abstraction while handling basic operations for books and students in a library.

✨ Features

➕ Add new books to the library.

👤 Manage student records.

📖 Issue and return books.

🔍 Search books by title or ID.

📦 Demonstrates all four pillars of OOP:

Encapsulation – private attributes with getters and setters.

Inheritance – students inherits from student.

Polymorphism – method overriding for different behaviors.

Abstraction – abstract logic separated in library classes.

🛠 Tech Stack

Language: Java

Paradigm: Object-Oriented Programming (OOP)

Runtime: JDK 8+

🚀 Getting Started
1. Clone the repo
git clone https://github.com/your-username/library-management-system.git
cd library-management-system

2. Compile the project
javac *.java

3. Run the project
java Library

📂 Project Structure
library-management-system/
│── Library.java      # Main class (entry point)
│── book.java         # Book entity
│── books.java        # Handles collection of books
│── student.java      # Student entity
│── students.java     # Handles collection of students
│── *.class           # Compiled files
│── README.md

🔑 Example Code
Encapsulation – Book.java
public class book {
    private String title;
    private String author;
    private int id;

    public book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getId() { return id; }
}

Inheritance – Student.java
public class student {
    protected String name;
    protected int studentId;

    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + studentId);
    }
}

public class students extends student {
    private String course;

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + ", Course: " + course);
    }
}

📸 Sample Output (Console)
Welcome to Library Management System
1. Add Book
2. Add Student
3. Issue Book
4. Return Book
5. Exit

🤝 Contributing

Pull requests are welcome.

📜 License

MIT License – free to use and modify.
