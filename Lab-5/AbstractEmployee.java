abstract class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
}
class Manager extends Employee {
    double bonus;
    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Programmer extends Employee {
    double overtimePay;
    Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
public class AbstractEmployee {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 60000, 12000);
        Employee p = new Programmer("Bob", 45000, 6000);
        System.out.println(m.name + " Salary: " + m.calculateSalary());
        System.out.println(p.name + " Salary: " + p.calculateSalary());
    }
}
