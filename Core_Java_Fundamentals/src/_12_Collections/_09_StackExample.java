// _09_StackExample.java
package _12_Collections;

import java.util.Stack;

public class _09_StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        
        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}