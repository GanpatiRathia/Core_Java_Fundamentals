package _05_Array;

import java.util.Arrays;

public class _06_CopyingAnArray {
    public static void main(String[] args) {
        int[] salaries = {50000, 60000, 70000, 80000};
        
        // Copy array
        int[] backupSalaries = Arrays.copyOf(salaries, salaries.length);

        System.out.println("Original Salaries: " + Arrays.toString(salaries));
        System.out.println("Backup Salaries: " + Arrays.toString(backupSalaries));
    }
}
