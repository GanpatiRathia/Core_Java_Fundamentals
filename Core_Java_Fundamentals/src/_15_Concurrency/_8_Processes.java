package _15_Concurrency;

import java.io.IOException;

/**
 * Demonstrates launching an external process using Runtime
 */
public class _8_Processes {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("notepad.exe"); // Opens Notepad
            System.out.println("Process started: Notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
