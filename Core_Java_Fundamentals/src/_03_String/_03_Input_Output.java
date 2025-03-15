package _03_String;

import java.util.Scanner;

// Class for demonstrating Input and Output operations in Java
public class _03_Input_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading an integer
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int intValue = scanner.nextInt();
            System.out.printf("You entered: %d\n", intValue);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume the invalid input
        }
        
        // Reading a floating-point number
        System.out.print("Enter a float: ");
        if (scanner.hasNextFloat()) {
            float floatValue = scanner.nextFloat();
            System.out.printf("You entered: %.2f\n", floatValue);
        } else {
            System.out.println("Invalid input. Please enter a float.");
            scanner.next(); // Consume the invalid input
        }
        
        // Reading a string (without spaces)
        System.out.print("Enter a word: ");
        if (scanner.hasNext()) {
            String word = scanner.next();
            System.out.printf("You entered: %s\n", word);
        }
        
        // Reading a full line (including spaces)
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter a sentence: ");
        if (scanner.hasNextLine()) {
            String sentence = scanner.nextLine();
            System.out.printf("You entered: %s\n", sentence);
        }
        
        // Checking for another integer input
        System.out.print("Enter another integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        int anotherInt = scanner.nextInt();
        System.out.printf("You entered: %d\n", anotherInt);
        
        // Formatting output examples
        System.out.printf("Decimal: %d\n", 159);
        System.out.printf("Hexadecimal: %x\n", 159);
        System.out.printf("Octal: %o\n", 159);
        System.out.printf("Floating point: %4.2f\n", 15.9);
        System.out.printf("Exponential: %e\n", 15456443.9);
        System.out.printf("Boolean: %b\n", true);
        System.out.printf("Character: %c\n", 'H');
        System.out.printf("String: %s\n", "Hello");
        System.out.printf("Hash code: %h\n", "Hello".hashCode());
        
        // Closing the scanner
        scanner.close();
    }
}
