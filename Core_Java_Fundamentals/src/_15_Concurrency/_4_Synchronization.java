package _15_Concurrency;

/**
 * Demonstrates synchronization to prevent race conditions
 */
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++; // Synchronized method ensures only one thread modifies count at a time
    }

    public int getCount() {
        return count;
    }
}

public class _4_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads modifying the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount()); // Expected 2000
    }
}
