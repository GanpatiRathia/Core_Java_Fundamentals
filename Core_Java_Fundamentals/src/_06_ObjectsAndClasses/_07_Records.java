package _06_ObjectsAndClasses;

record Person(String name, int age) {} // Java14+
//Using Java Records for immutable data representation.

public class _07_Records {
    public static void main(String[] args) {
        Person p = new Person("Bob", 30);
        System.out.println("Person: " + p.name() + ", Age: " + p.age());
    }
}
