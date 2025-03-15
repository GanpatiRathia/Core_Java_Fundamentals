package _02_Operators;

public class _03_IncrementDecrement {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a)); // a is incremented first, then printed

        // Post-increment
        System.out.println("Post-increment (a++): " + (a++)); // a is printed first, then incremented
        System.out.println("Value of a after post-increment: " + a);

        // Pre-decrement
        System.out.println("Pre-decrement (--b): " + (--b)); // b is decremented first, then printed

        // Post-decrement
        System.out.println("Post-decrement (b--): " + (b--)); // b is printed first, then decremented
        System.out.println("Value of b after post-decrement: " + b);
    }
}
