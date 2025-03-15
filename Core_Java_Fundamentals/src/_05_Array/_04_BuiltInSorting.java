package _05_Array;

import java.util.Arrays;

public class _04_BuiltInSorting {
    public static void main(String[] args) {
        double[] prices = {499.99, 150.75, 250.50, 99.99, 799.25};

        // Sorting using built-in method
        Arrays.sort(prices);

        System.out.println("Sorted Product Prices:");
        for (double price : prices) {
            System.out.println("$" + price);
        }
    }
}
