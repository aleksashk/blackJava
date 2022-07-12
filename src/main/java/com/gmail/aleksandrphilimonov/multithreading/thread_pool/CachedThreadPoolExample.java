package com.gmail.aleksandrphilimonov.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 500000; i++) {
            service.execute(new RunnableImp50());
        }
        service.shutdown();
    }
}

class RunnableImp50 implements Runnable {
    int sleepTime = 1;

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " -> takes time: " + (System.currentTimeMillis() - time - sleepTime) + " milliseconds;");
    }
}
