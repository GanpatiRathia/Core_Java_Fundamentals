package _04_Control_Flow;

import java.util.Scanner;

public class _05_RestaurantBillingUsingNestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menu = {"Pizza", "Burger", "Pasta", "Fries"};
        int[] prices = {250, 150, 200, 100};
        
        int totalBill = 0;
        String choice;
        
        do {
            System.out.println("Menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - Rs. " + prices[i]);
            }
            
            System.out.print("Enter item number to order: ");
            int item = scanner.nextInt();
            
            if (item >= 1 && item <= menu.length) {
                totalBill += prices[item - 1];
                System.out.println(menu[item - 1] + " added to bill.");
            } else {
                System.out.println("Invalid item selected.");
            }
            
            System.out.print("Do you want to order more? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
        
        System.out.println("Total bill: Rs. " + totalBill);
        scanner.close();
    }
}
