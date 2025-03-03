package com.dmdev.multithreading.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {
    private final Semaphore cashBoxes;

    public BuyerThread(Semaphore cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            cashBoxes.acquire();

            System.out.println(Thread.currentThread().getName() + " обслуживается в какой-то кассе " );
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю  какуе-то кассу " );

            cashBoxes.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


