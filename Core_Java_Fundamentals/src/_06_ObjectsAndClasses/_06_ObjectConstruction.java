package _06_ObjectsAndClasses;

class Employee {
    String name;
    double salary;

    Employee(String empName, double empSalary) {
        name = empName;
        salary = empSalary;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", Salary: $" + salary);
    }
}

public class _06_ObjectConstruction {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 50000);
        e.display();
    }
}
