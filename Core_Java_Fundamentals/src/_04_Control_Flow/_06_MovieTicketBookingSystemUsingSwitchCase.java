package _04_Control_Flow;

import java.util.Scanner;

public class _06_MovieTicketBookingSystemUsingSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Movie Type:");
        System.out.println("1. Standard");
        System.out.println("2. 3D");
        System.out.println("3. IMAX");
        
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        int price;
        switch (choice) {
            case 1:
                price = 200;
                System.out.println("You selected Standard movie. Ticket Price: Rs. " + price);
                break;
            case 2:
                price = 350;
                System.out.println("You selected 3D movie. Ticket Price: Rs. " + price);
                break;
            case 3:
                price = 500;
                System.out.println("You selected IMAX movie. Ticket Price: Rs. " + price);
                break;
            default:
                System.out.println("Invalid selection.");
                scanner.close();
                return;
        }

        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();
        
        System.out.println("Total cost: Rs. " + (tickets * price));
        scanner.close();
    }
}
