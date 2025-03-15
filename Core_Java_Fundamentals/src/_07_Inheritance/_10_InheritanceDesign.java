package _07_Inheritance;

/**
 * Demonstrates best practices for Inheritance design.
 * 
 * @author Ganpati Rathia
 */
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + " earns $" + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void display() {
        System.out.println(name + " (Manager) earns $" + (salary + bonus));
    }
}

public class _10_InheritanceDesign {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000, 10000);

        emp.display();
        mgr.display();
    }
}
