package com.gmail.aleksandrphilimonov.multithreading.thread_pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            service.execute(new RunnableEmpl300());
//        }

        service.schedule(new RunnableEmpl300(), 3, TimeUnit.SECONDS);
        service.shutdown();
    }
}

class RunnableEmpl300 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}