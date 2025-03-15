package _02_Operators;

public class _07_HierarchyParentheses {
    public static void main(String[] args) {

    	// Overall operator precedence (highest to lowest):
        // 1. [] . () (method call) - Left to right
        // 2. ! ~ ++ -- + (unary) - (unary) () (cast) new - Right to left
        // 3. * / % - Left to right
        // 4. + - - Left to right
    	// 5. << >> >>> - Left to right
        // 6. < <= > >= instanceof - Left to right
        // 7. == != - Left to right
        // 8. & - Left to right
        // 9. ^ - Left to right
        // 10. | - Left to right
        // 11. && - Left to right
        // 12. || - Left to right
        // 13. ?: (Ternary operator) - Right to left
        // 14. = += -= *= /= %= &= ^= |= <<= >>= >>>= - Right to left

      
        int a = 10, b = 5, c = 2;

        // Print initial values
        System.out.println("Initial values: a = " + a + ", b = " + b + ", c = " + c);

        // Operator precedence without parentheses
        int result1 = a + b * c;
        System.out.println("a + b * c (Without parentheses): " + result1);
        // Multiplication (*) has higher precedence than addition (+), so b * c is evaluated first.

        // Operator precedence with parentheses
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c (With parentheses): " + result2);
        // Parentheses change the order of execution, forcing a + b to be evaluated first.

        // Mixed operators
        int result3 = a / b + c;
        System.out.println("a / b + c: " + result3);
        // Division (/) has higher precedence than addition (+), so a / b is evaluated first.

        int result4 = a / (b + c);
        System.out.println("a / (b + c): " + result4);
        // Parentheses force b + c to be evaluated first before division.

        // More complex expression
        int result5 = a - b + c * a / b;
        System.out.println("a - b + c * a / b: " + result5);
        // Multiplication (*) and division (/) happen first, followed by subtraction (-) and addition (+).
    }
}
