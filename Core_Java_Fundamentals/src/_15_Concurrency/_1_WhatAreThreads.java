package _15_Concurrency;

/**
 * This program demonstrates how to create and start threads using:
 * 1. Extending the Thread class
 * 2. Implementing the Runnable interface
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

public class _1_WhatAreThreads {
    public static void main(String[] args) {
        // Creating a thread by extending Thread class
        MyThread thread1 = new MyThread();
        
        // Creating a thread by implementing Runnable interface
        Thread thread2 = new Thread(new MyRunnable());

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
