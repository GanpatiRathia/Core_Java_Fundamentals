// _08_PriorityQueueExample.java
package _12_Collections;

import java.util.PriorityQueue;

public class _08_PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Polling from PriorityQueue: " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);
    }
}