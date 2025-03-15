package _02_Operators;

public class _05_Conditional_Ternary_Operator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Print initial values
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Ternary Operator (Conditional Operator)
        int min = (a < b) ? a : b;
        System.out.println("Minimum value using ternary operator: " + min);

        // Using ternary operator for even-odd check
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is " + result);
    }
}
