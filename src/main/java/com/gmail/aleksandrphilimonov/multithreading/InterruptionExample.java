package com.gmail.aleksandrphilimonov.multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();

        thread.join();
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " is wanted to interrupt");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
