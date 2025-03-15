// _05_HashMapExample.java
package _12_Collections;

import java.util.HashMap;

public class _05_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("HashMap: " + map);
    }
}