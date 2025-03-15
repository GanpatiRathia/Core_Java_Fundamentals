// _03_HashSetExample.java
package _12_Collections;

import java.util.HashSet;

public class _03_HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");
        set.add("Dog"); // Duplicate will be ignored
        
        System.out.println("HashSet: " + set);
    }
}