class Employee {
    double baseSalary;
    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    double calculateSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {
    double bonus;

    Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Programmer extends Employee {
    double overtimePay;
    Programmer(double baseSalary, double overtimePay) {
        super(baseSalary);
        this.overtimePay = overtimePay;
    }
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Manager m = new Manager(50000, 10000);
        Programmer p = new Programmer(40000, 5000);
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Programmer Salary: " + p.calculateSalary());
    }
}
