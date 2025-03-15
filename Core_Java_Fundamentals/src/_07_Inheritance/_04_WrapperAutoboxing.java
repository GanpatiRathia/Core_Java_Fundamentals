package _07_Inheritance;

/**
 * Demonstrates Autoboxing and Unboxing with Wrapper Classes.
 * 
 * @author Ganpati Rathia
 */
public class _04_WrapperAutoboxing {
    public static void main(String[] args) {
        Integer num = 10; // Autoboxing: int → Integer
        int value = num;  // Unboxing: Integer → int

        System.out.println("Autoboxed Integer: " + num);
        System.out.println("Unboxed int: " + value);
    }
}
