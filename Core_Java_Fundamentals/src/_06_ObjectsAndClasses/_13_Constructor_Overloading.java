package _06_ObjectsAndClasses;

import java.util.Scanner;

/**
 * Represents an Employee with details such as name, ID, salary, and department.
 * Demonstrates constructor overloading, encapsulation, final fields, static fields, 
 * factory methods, and method parameters.
 * 
 * @author Ganpati Rathia
 */
public class _13_Constructor_Overloading {
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
     * Constructor Overloading - Primary Constructor with all parameters.
     * @param name Employee Name
     * @param salary Employee Salary
     * @param department Employee Department
     */
    public _13_Constructor_Overloading(String name, double salary, String department) {
        this.employeeId = ++employeeCounter; // Auto-incrementing unique ID
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    /**
     * Overloaded Constructor - Assigns a default department.
     * @param name Employee Name
     * @param salary Employee Salary
     */
    public _13_Constructor_Overloading(String name, double salary) {
        this(name, salary, "General"); // Calls the primary constructor
    }

    /**
     * Overloaded Constructor - Assigns default salary and department.
     * @param name Employee Name
     */
    public _13_Constructor_Overloading(String name) {
        this(name, 30000.0, "General"); // Default salary and department
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

        // Creating Employees using Different Constructors
        _13_Constructor_Overloading emp1 = new _13_Constructor_Overloading(name, salary, department);
        _13_Constructor_Overloading emp2 = new _13_Constructor_Overloading(name, salary); // Default department
        _13_Constructor_Overloading emp3 = new _13_Constructor_Overloading(name); // Default salary & department

        // Display Employee details
        System.out.println("\nEmployee Created with All Details:");
        emp1.displayEmployeeDetails();

        System.out.println("\nEmployee Created with Default Department:");
        emp2.displayEmployeeDetails();

        System.out.println("\nEmployee Created with Default Salary and Department:");
        emp3.displayEmployeeDetails();

        scanner.close();
    }
}
