package _05_Array;

public class _01_BasicArrayInitialization {
	
	public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};  // Array of marks

        // Display all marks
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

}
