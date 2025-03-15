package _07_Inheritance;

/**
 * Demonstrates how all classes implicitly inherit from the Object class.
 * Uses overridden toString() method.
 * 
 * @author Ganpati Rathia
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class _02_ObjectSuperclass {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.toString()); // Implicitly calls toString()
    }
}
