package _15_Concurrency;

/**
 * Demonstrates setting thread name and priority
 */
public class _3_ThreadProperties {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        });

        // Setting name and priority
        thread.setName("HighPriorityThread");
        thread.setPriority(Thread.MAX_PRIORITY);

        thread.start();
    }
}
