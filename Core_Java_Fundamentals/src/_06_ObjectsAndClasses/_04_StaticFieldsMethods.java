package _06_ObjectsAndClasses;

class MathUtility {
    static final double PI = 3.14159;

    static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class _04_StaticFieldsMethods {
    public static void main(String[] args) {
        double area = MathUtility.circleArea(5);
        System.out.println("Area of circle: " + area);
    }
}
