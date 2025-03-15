package _05_Array;

import java.util.Scanner;

public class _03_Searching {
    public static void main(String[] args) {
        int[] rollNumbers = {101, 102, 103, 104, 105}; // Database of roll numbers
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number to search: ");
        int search = scanner.nextInt();
        boolean found = false;

        for (int roll : rollNumbers) {
            if (roll == search) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("Roll number exists in database.");
        else System.out.println("Roll number not found.");
        
        scanner.close();
    }
}
