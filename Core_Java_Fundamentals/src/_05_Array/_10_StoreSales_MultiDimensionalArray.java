package _05_Array;

public class _10_StoreSales_MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] sales = {
            {5000, 6000, 7000},  // Store 1 sales
            {4000, 4500, 5000},  // Store 2 sales
            {3000, 3500, 4000}   // Store 3 sales
        };

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Store " + (i + 1) + " Sales: ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("$" + sales[i][j] + " ");
            }
            System.out.println();
        }
    }
}
