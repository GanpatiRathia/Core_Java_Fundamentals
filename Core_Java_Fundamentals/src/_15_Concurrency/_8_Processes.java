package _15_Concurrency;

import java.io.IOException;

/**
 * Demonstrates launching an external process using Runtime
 */
public class _8_Processes {
    public static void main(String[] args) {
    	try {
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe"); // Process process = Runtime.getRuntime().exec("notepad.exe"); Depreciated  
            Process process = processBuilder.start();
            process.waitFor(); // Waits for the process to exit (optional)
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
