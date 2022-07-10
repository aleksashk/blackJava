package com.gmail.aleksandrphilimonov.multithreading.monitor_synchronized;

public class SynchExample1 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnableImpl1 = new MyRunnableImpl1();
        Thread t1 = new Thread(runnableImpl1);
        Thread t2 = new Thread(runnableImpl1);
        Thread t3 = new Thread(runnableImpl1);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnableImpl1 implements Runnable {

    public void increment() {
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}