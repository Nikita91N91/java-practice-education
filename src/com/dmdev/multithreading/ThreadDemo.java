package com.dmdev.multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());

        var runnableThread = new Thread(new SimpleRunnable());
        var lambda = new Thread(() -> System.out.println("Hello from lambda :" + Thread.currentThread().getName()));

        simpleThread.start();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());

        runnableThread.start();
        lambda.start();
        try {
            simpleThread.join(100);
            System.out.println(simpleThread.getName() + " " + simpleThread.getState());

            runnableThread.join();
            lambda.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}
