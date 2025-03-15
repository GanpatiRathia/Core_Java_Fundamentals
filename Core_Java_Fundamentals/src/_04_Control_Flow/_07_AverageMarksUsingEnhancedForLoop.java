package _04_Control_Flow;

import java.util.Scanner;

public class _07_AverageMarksUsingEnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / subjects;
        System.out.println("Average marks: " + average);

        scanner.close();
    }
}
