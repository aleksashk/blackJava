package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample10 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MulThExample10 thread = new MulThExample10();
        thread.start();
        Thread.sleep(3000);
        System.out.println("Wake up!!");
        thread.b = false;
        thread.join();
        System.out.println("end");
    }
}
