package _06_ObjectsAndClasses;

class Student {
    String name;

    void changeName(String newName) {
        name = newName;
    }
}

public class _05_MethodParameters {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.changeName("Alice");
        System.out.println("Updated Name: " + s.name);
    }
}
