// _06_AssertionsExample.java
package _09_ExceptionHandling;

public class _06_AssertionsExample {
    public static void main(String[] args) {
        int x = -1;
        assert x >= 0 : "x should be non-negative";
        System.out.println("Value of x: " + x);
    }
}
