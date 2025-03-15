package _04_Control_Flow;

import java.util.Scanner;

public class _01_TrafficSignalSystem_Using_If_Else_Statement {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light color (Red/Yellow/Green): ");
        String color = scanner.nextLine().toLowerCase();

        if (color.equals("red")) {
            System.out.println("Stop! Wait for the signal to change.");
        } else if (color.equals("yellow")) {
            System.out.println("Get ready to move.");
        } else if (color.equals("green")) {
            System.out.println("Go! Drive safely.");
        } else {
            System.out.println("Invalid color entered.");
        }
        scanner.close();
    }

}
