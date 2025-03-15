package _01_Intro_Data_Types;

import java.util.Scanner;  // Import Scanner for user input


public class _04_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();  // Read first number

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();  // Read second number

        double sum = num1 + num2;  // Perform addition
        System.out.println("Sum: " + sum);

        scanner.close();  // Close scanner
    }
}
