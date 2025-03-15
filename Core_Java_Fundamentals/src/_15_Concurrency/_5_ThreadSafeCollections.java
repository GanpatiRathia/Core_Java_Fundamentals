package _15_Concurrency;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Demonstrates thread-safe collections using ConcurrentHashMap
 */
public class _5_ThreadSafeCollections {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) map.put(i, "Value " + i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) map.put(i, "Value " + i);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Map contents: " + map);
    }
}
