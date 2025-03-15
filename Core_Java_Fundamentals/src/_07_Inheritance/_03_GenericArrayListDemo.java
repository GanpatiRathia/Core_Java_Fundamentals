package _07_Inheritance;

import java.util.ArrayList;

/**
 * Demonstrates the usage of Generic ArrayLists.
 * 
 * @author Ganpati Rathia
 */
public class _03_GenericArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
