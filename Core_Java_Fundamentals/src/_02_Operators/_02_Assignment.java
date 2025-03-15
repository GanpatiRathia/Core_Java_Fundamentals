package _02_Operators;

public class _02_Assignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        
        // Addition assignment
        a += b; // Equivalent to a = a + b
        System.out.println("After a += b: " + a);
        
        // Subtraction assignment
        a -= b; // Equivalent to a = a - b
        System.out.println("After a -= b: " + a);
        
        // Multiplication assignment
        a *= b; // Equivalent to a = a * b
        System.out.println("After a *= b: " + a);
        
        // Division assignment
        a /= b; // Equivalent to a = a / b
        System.out.println("After a /= b: " + a);
        
        // Modulus assignment
        a %= b; // Equivalent to a = a % b
        System.out.println("After a %= b: " + a);
        
        // Bitwise AND assignment
        a &= b; // Equivalent to a = a & b
        System.out.println("After a &= b: " + a);
        
        // Bitwise OR assignment
        a |= b; // Equivalent to a = a | b
        System.out.println("After a |= b: " + a);
        
        // Bitwise XOR assignment
        a ^= b; // Equivalent to a = a ^ b
        System.out.println("After a ^= b: " + a);
        
        // Left shift assignment
        a <<= 2; // Equivalent to a = a << 2
        System.out.println("After a <<= 2: " + a);
        
        // Right shift assignment
        a >>= 2; // Equivalent to a = a >> 2
        System.out.println("After a >>= 2: " + a);
        
        // Unsigned right shift assignment
        a >>>= 2; // Equivalent to a = a >>> 2
        System.out.println("After a >>>= 2: " + a);
    }
}
