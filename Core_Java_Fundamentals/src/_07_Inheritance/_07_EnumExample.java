package _07_Inheritance;

/**
 * Demonstrates the use of Enums in Java.
 * 
 * @author Ganpati Rathia
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class _07_EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}
