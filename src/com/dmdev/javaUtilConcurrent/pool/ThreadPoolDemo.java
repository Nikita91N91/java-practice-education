package com.dmdev.javaUtilConcurrent.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();
//
//        Executors.newScheduledThreadPool(3);
//        Executors.newWorkStealingPool();

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.scheduleAtFixedRate(() -> System.out.println("ok"), 3L, 4L, TimeUnit.SECONDS);

//        threadPool.shutdown();
//        threadPool.awaitTermination(1L, TimeUnit.HOURS);
    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("Result " + future.get());

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
