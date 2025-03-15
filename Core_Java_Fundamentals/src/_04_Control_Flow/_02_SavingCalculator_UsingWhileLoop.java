package _04_Control_Flow;

import java.util.Scanner;

public class _02_SavingCalculator_UsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your savings goal amount: ");
        double goal = scanner.nextDouble();

        System.out.print("Enter your monthly deposit: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int months = 0;

        while (balance < goal) {
            balance += deposit;
            double interest = (balance * interestRate) / 1200;
            balance += interest;
            months++;
        }

        System.out.println("You will reach your goal in " + months + " months.");
        scanner.close();
    }
}
