package com.dmdev.multithreading.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashBoxRunner {

    public static void main(String[] args) throws InterruptedException {

        //   BlockingQueue<CashBox> cashBoxes = new ArrayBlockingQueue<> (2,true,List.of(new CashBox(1), new CashBox(2)));
        Semaphore cashBoxes = new Semaphore(2);

        List<Thread> threads = Stream.of(
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes)
                )
                .map(Thread::new)
                .peek(Thread::start)
                .toList();

        for (Thread thread : threads) {
            thread.join();
        }


    }
}
