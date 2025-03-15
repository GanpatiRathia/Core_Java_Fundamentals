package _07_Inheritance;

/**
 * Demonstrates the use of varargs in methods.
 * 
 * @author Ganpati Rathia
 */
public class _05_VarargsExample {
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20);
    }
}
