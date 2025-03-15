package _02_Operators;

public class _06_Bitwise {
    public static void main(String[] args) {
        int a = 5, b = 3;

        // Print initial values
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // 0101 & 0011 = 0001 (1)

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // 0101 | 0011 = 0111 (7)

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // 0101 ^ 0011 = 0110 (6)

        // Bitwise Complement
        System.out.println("~a: " + (~a)); // ~0101 = 1010 (-6 in 2's complement)

        // Left Shift
        System.out.println("a << 1: " + (a << 1)); // 0101 << 1 = 1010 (10)

        // Right Shift
        System.out.println("a >> 1: " + (a >> 1)); // 0101 >> 1 = 0010 (2)

        // Unsigned Right Shift
        System.out.println("a >>> 1: " + (a >>> 1)); // 0101 >>> 1 = 0010 (2)
    }
}
