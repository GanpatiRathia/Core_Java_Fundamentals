package _06_ObjectsAndClasses;

import java.util.Scanner;

/**
 * Represents an Employee with details such as name, ID, salary, and department.
 * Demonstrates encapsulation, final fields, static fields, factory methods, 
 * and method parameters.
 * 
 * @author Ganpati Rathia
 */
public class _12_Employee {
    // Constants (Final Static Fields)
    private static final String COMPANY_NAME = "TechCorp";

    // Instance Variables (Private for Encapsulation)
    private final int employeeId; // Final instance variable (must be initialized in constructor)
    private String name;
    private double salary;
    private String department;

    // Static Variable (Shared across all instances)
    private static int employeeCounter = 1000; // Unique ID generator

    /**
     * Private Constructor to prevent direct object creation.
     * Used by factory method.
     * 
     * @param name Employee Name
     * @param salary Employee Salary
     * @param department Employee Department
     */
    private _12_Employee(String name, double salary, String department) {
        this.employeeId = ++employeeCounter; // Auto-incrementing unique ID
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters (to access private fields)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters (to modify non-final fields)
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Factory Method to create Employee objects.
     * 
     * @param name Employee name
     * @param salary Employee salary
     * @param department Employee department
     * @return New Employee object
     */
    public static _12_Employee createEmployee(String name, double salary, String department) {
        return new _12_Employee(name, salary, department);
    }

    /**
     * Final method to display Employee details.
     * Cannot be overridden in subclasses.
     */
    public final void displayEmployeeDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println("Department: " + department);
        System.out.println("-------------------------------------");
    }

    /**
     * Main Method - Demonstrates Employee Class Usage.
     * Takes input from the user to create an Employee object.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        // Creating an Employee using Factory Method
        _12_Employee emp = _12_Employee.createEmployee(name, salary, department);

        // Display Employee details
        emp.displayEmployeeDetails();

        // Modify and display updated details
        System.out.print("Enter new Salary for " + emp.getName() + ": ");
        double newSalary = scanner.nextDouble();
        emp.setSalary(newSalary);

        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();

        scanner.close();
    }
}
