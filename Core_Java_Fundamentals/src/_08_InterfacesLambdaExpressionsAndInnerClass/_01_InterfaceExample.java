package _08_InterfacesLambdaExpressionsAndInnerClass;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

public class _01_InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
