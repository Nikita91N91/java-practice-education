package com.dmdev.javaUtilConcurrent.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("Start"));

        ExecutorService fixedThreadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail,cyclicBarrier))
                .forEach(fixedThreadPool::submit);

        fixedThreadPool.shutdown();
        fixedThreadPool.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
