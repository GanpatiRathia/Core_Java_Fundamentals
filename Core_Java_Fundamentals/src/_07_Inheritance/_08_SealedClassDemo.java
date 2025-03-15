package _07_Inheritance;

/**
 * Demonstrates Sealed Classes.
 * Requires Java 17+.
 * 
 * @author Ganpati Rathia
 */
sealed class Shape permits Circle, Rectangle { }

final class Circle extends Shape { }
final class Rectangle extends Shape { }

public class _08_SealedClassDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        System.out.println("Shapes created successfully.");
    }
}
