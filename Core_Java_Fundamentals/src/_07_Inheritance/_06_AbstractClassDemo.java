package _07_Inheritance;

/**
 * Demonstrates Abstract Classes and Methods.
 * 
 * @author Ganpati Rathia
 */
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

public class _06_AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}
