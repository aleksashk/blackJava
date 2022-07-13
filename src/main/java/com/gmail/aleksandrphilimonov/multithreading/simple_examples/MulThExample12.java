package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample12 {
    static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        Object o = new Object();


        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 900000; i++) {
            MulThExample12.increment();
        }
    }
}
