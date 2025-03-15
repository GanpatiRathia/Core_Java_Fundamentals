package _15_Concurrency;

import java.util.concurrent.CompletableFuture;

/**
 * Demonstrates asynchronous computations using CompletableFuture
 */
public class _7_AsynchronousComputations {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                return "Async Task Completed!";
            } catch (InterruptedException e) {
                return "Error";
            }
        }).thenAccept(result -> System.out.println("Received: " + result));

        System.out.println("Main thread continues execution...");
    }
}
