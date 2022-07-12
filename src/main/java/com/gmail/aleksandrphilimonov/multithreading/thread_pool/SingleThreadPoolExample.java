package com.gmail.aleksandrphilimonov.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            service.execute(new RunnableImp1000());
        }
        service.shutdown();
    }
}

class RunnableImp1000 implements Runnable {
    int sleepTime = 500;

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