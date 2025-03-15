// _02_GenericMethod.java
package _11_GenericProgramming;

public class _02_GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        printArray(intArray);
        printArray(strArray);
    }
}