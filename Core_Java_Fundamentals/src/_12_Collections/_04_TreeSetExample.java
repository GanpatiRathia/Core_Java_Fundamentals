// _04_TreeSetExample.java
package _12_Collections;

import java.util.TreeSet;

public class _04_TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}