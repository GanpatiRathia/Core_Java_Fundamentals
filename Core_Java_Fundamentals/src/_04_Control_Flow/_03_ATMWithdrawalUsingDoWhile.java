package _04_Control_Flow;

import java.util.Scanner;

public class _03_ATMWithdrawalUsingDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000; // Initial balance
        int withdrawal;
        String choice;

        do {
            System.out.print("Enter amount to withdraw: ");
            withdrawal = scanner.nextInt();

            if (withdrawal > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= withdrawal;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }

            System.out.print("Do you want to withdraw again? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our ATM.");
        scanner.close();
    }
}
