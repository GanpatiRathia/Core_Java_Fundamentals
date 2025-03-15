package _06_ObjectsAndClasses;

class Car {
    String brand;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }
}

public class _01_OOPs {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 50;
        myCar.accelerate();
    }
}
