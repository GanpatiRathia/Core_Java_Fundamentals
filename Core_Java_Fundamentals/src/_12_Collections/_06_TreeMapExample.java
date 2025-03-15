// _06_TreeMapExample.java
package _12_Collections;

import java.util.TreeMap;

public class _06_TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 100);
        treeMap.put("C", 300);
        treeMap.put("B", 200);
        
        System.out.println("TreeMap (Sorted by Key): " + treeMap);
    }
}