class Student {
    String name;
    int id;
    String course;

    void displayDetails() {
        System.out.println("Student Name: " + name + " | ID: " + id + " | Course: " + course);
    }
}

class Faculty {
    String name;
    int id;
    String department;

    void displayDetails() {
        System.out.println("Faculty Name: " + name + " | ID: " + id + " | Department: " + department);
    }
}

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name + " | ID: " + id + " | Salary: " + salary);
    }
}

class Library {

    String libraryName;
    int totalBooks;

    void displayDetails() {
        System.out.println("Library Name: " + libraryName + " | Total Books: " + totalBooks);
    }
}

public class EntitiesDemo {
    public static void main(String[] args) {
        System.out.println("--- University Entities ---");

        // 1. Using Student
        Student s = new Student();
        s.name = "Alice";
        s.id = 101;
        s.course = "Computer Science";
        s.displayDetails();

        // 2. Using Faculty
        Faculty f = new Faculty();
        f.name = "Dr. Bob";
        f.id = 201;
        f.department = "Physics";
        f.displayDetails();

        // 3. Using Employee
        Employee e = new Employee();
        e.name = "Charlie";
        e.id = 301;
        e.salary = 50000.0;
        e.displayDetails();

        // 4. Using Library
        Library l = new Library();
        l.libraryName = "Central Library";
        l.totalBooks = 15000;
        l.displayDetails();
    }
}
