package _06_ObjectsAndClasses;

import java.time.*;

/**
 * @version 1.5 2015-05-08
 * @author Cay Horstmann
 */

// Using Predefined Java Class
public class _02_CalenderTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Get current date
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // Set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ..., 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // Print leading spaces for the first week
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == today)
                System.out.print("* "); // Highlight the current day
            else
                System.out.print("  ");

            date = date.plusDays(1);

            // Start a new line if it's Monday (start of a week)
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }

        // Ensure the last line is printed properly
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
