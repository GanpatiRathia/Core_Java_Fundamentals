package _05_Array;

public class _02_MinimumMaximum {
	
	public static void main(String[] args) {
        int[] temperatures = {30, 25, 28, 32, 29, 31, 27};  // Weekly temperatures

        int max = temperatures[0], min = temperatures[0];

        for (int temp : temperatures) {
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        System.out.println("Highest Temperature: " + max + "°C");
        System.out.println("Lowest Temperature: " + min + "°C");
    }

}