package _05_Array;

public class _09_JaggedArray_UnequalColumnSize {
    public static void main(String[] args) {
        // Jagged array representing students and the subjects they attended
        int[][] studentSubjects = {
            {101, 102},         // Student 1 attended 2 subjects
            {103, 104, 105},    // Student 2 attended 3 subjects
            {106},              // Student 3 attended 1 subject
        };

        for (int i = 0; i < studentSubjects.length; i++) {
            System.out.print("Student " + (i + 1) + " attended subjects: ");
            for (int subject : studentSubjects[i]) {
                System.out.print(subject + " ");
            }
            System.out.println();
        }
    }
}
