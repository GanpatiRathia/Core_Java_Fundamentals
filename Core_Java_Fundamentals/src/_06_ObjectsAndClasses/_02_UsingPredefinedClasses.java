package _06_ObjectsAndClasses;

import java.util.Random;

public class _02_UsingPredefinedClasses {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100); // Generate a random number from 0 to 99
        System.out.println("Random number: " + randomNum);
    }
}
