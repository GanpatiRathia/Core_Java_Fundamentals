// _04_ThrowsKeyword.java
package _09_ExceptionHandling;

public class _04_ThrowsKeyword {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}