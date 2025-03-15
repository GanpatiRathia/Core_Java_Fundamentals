// _04_GenericInterface.java
package _11_GenericProgramming;

interface GenericInterface<T> {
    T performOperation(T input);
}

class StringReverser implements GenericInterface<String> {
    public String performOperation(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

public class _04_GenericInterface {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        System.out.println("Reversed: " + reverser.performOperation("Hello"));
    }
}