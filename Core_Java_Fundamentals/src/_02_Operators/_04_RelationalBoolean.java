package _02_Operators;

public class _04_RelationalBoolean {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Print initial values
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Boolean (Logical) Operators
        boolean x = true;
        boolean y = false;

        // Print initial boolean values
        System.out.println("Initial boolean values: x = " + x + ", y = " + y);
        
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
    }
}
