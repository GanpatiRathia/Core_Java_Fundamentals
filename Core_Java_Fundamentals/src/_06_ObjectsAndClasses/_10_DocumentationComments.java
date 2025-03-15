package _06_ObjectsAndClasses;

/**
 * Represents a simple Calculator.
 * Provides basic arithmetic operations.
 */
class Calculator {
    /**
     * Adds two numbers.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
}

public class _10_DocumentationComments {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(5, 10));
    }
}
