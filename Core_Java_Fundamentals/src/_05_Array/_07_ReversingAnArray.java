package _05_Array;

public class _07_ReversingAnArray {
    public static void main(String[] args) {
        int[] customerIDs = {101, 102, 103, 104, 105};

        System.out.print("Reversed Customer IDs: ");
        for (int i = customerIDs.length - 1; i >= 0; i--) {
            System.out.print(customerIDs[i] + " ");
        }
    }
}
