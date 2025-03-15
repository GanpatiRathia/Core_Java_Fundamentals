// _05_CustomException.java
package _09_ExceptionHandling;

@SuppressWarnings("serial")
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class _05_CustomException {
    static void validate(int number) throws MyException {
        if (number < 0) {
            throw new MyException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (MyException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}