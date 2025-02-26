package com.dmdev.multithreading.atomicExample;

public class Counter {
    private static String description;
    private int count;

    public
    static void init() {
        Class<Counter> counterClass = Counter.class;
        synchronized (counterClass) {
            if (description == null) {
                description = "Test description";
            }
        }

    }

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}
