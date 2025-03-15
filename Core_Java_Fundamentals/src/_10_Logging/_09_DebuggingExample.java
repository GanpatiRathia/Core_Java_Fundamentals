// _09_DebuggingExample.java
package _10_Logging;

public class _09_DebuggingExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Debug: Division by zero attempted.");
        }
    }
}