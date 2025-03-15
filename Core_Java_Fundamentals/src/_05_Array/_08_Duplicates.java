package _05_Array;

public class _08_Duplicates {
    public static void main(String[] args) {
        int[] employeeIDs = {101, 102, 103, 104, 101, 105};

        System.out.println("Duplicate Employee IDs:");
        for (int i = 0; i < employeeIDs.length; i++) {
            for (int j = i + 1; j < employeeIDs.length; j++) {
                if (employeeIDs[i] == employeeIDs[j]) {
                    System.out.println(employeeIDs[i]);
                }
            }
        }
    }
}
