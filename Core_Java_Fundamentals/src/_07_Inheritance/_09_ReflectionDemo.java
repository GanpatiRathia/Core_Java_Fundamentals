package _07_Inheritance;

import java.lang.reflect.Method;

/**
 * Demonstrates Reflection in Java.
 * 
 * @author Ganpati Rathia
 */
public class _09_ReflectionDemo {
    public static void main(String[] args) {
        Class<?> objClass = String.class;

        Method[] methods = objClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
