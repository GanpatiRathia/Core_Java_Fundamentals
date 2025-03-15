// _07_QueueExample.java
package _12_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class _07_QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println("Queue: " + queue);
        System.out.println("Polling from Queue: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
