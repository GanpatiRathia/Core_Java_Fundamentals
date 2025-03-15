// _05_GenericWildcard.java
package _11_GenericProgramming;

import java.util.Arrays;
import java.util.List;

public class _05_GenericWildcard {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<String> strList = Arrays.asList("A", "B", "C");
        
        printList(intList);
        printList(strList);
    }
}
