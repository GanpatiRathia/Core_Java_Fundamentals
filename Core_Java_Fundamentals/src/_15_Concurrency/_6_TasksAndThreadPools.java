package _15_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Demonstrates using ExecutorService to manage multiple tasks efficiently
 */
public class _6_TasksAndThreadPools {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            executor.execute(() -> System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}
