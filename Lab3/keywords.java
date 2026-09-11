class Person {
    String name = "Parent";
    void display() {
        System.out.println("This is Person class");
    }
}
class Student extends Person {
    String name;
    final int age = 20;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
        super.display();
        System.out.println("Parent Name: " + super.name);
        System.out.println("Age: " + age);
    }
}
public class keywords {
    public static void main(String[] args) {
        Student s = new Student("Yesh");
        s.display();
    }
}



