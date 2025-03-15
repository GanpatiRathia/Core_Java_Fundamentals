package _07_Inheritance;

/**
 * Demonstrates basic inheritance: superclass and subclass relationship.
 * 
 * @author Ganpati Rathia
 */
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

public class _01_ClassHierarchy {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Unknown");
        Dog dog = new Dog("Buddy");

        genericAnimal.makeSound();
        dog.makeSound();
    }
}
