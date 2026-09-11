// 1. Declare two classes: Student and Faculty. 
// The classes will have the data members and constructors as per your convenience. Write a JAVA program: 
// (i) where the Faculty will enter the marks of all the students. 
// (ii) Once the marks are entered, the student can view the marks.

import java.util.Scanner;

class Student{
    String name;
    int marks;

Student(String name){
    this.name=name;
}
void displaymarks(){
    System.out.println("Student Name:" + name);
    System.out.println("Marks :" + marks);
}
}
class Faculty{
    void entermarks(Student s, int marks){
        s.marks = marks;
        System.out.println("Marks Entered Successfully");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Yesh");
        Student s2 = new Student("Rahul");
        Faculty f = new Faculty();
        System.out.println("Enter Makrs for Yesh: ");
        int marks1 = sc.nextInt();
        f.entermarks(s1, marks1);
        System.out.println("Enter Makrs for Rahul: ");
        int marks2 = sc.nextInt();
        f.entermarks(s2, marks2);
        System.out.println(" Student Marks :");
        s1.displaymarks();
        s2.displaymarks();
        sc.close();
        

        
    }
}