package com.gmail.aleksandrphilimonov.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            service.execute(new RunnableImp());
        }
        service.shutdown();
    }
}

class RunnableImp implements Runnable {

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " -> takes time: " + (System.currentTimeMillis() - time - 2000) + " milliseconds;");
    }
}