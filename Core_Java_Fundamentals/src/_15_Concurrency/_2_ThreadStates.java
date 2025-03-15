package _15_Concurrency;

/**
 * This program demonstrates different thread states:
 * NEW, RUNNABLE, TIMED_WAITING, TERMINATED
 */
public class _2_ThreadStates {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(500); // Thread enters TIMED_WAITING state
                System.out.println("Thread is running...");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });

        System.out.println("Thread state before start: " + thread.getState()); // NEW
        thread.start();
        System.out.println("Thread state after start: " + thread.getState()); // RUNNABLE
    }
}
