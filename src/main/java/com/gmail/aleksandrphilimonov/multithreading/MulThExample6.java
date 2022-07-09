package com.gmail.aleksandrphilimonov.multithreading;

public class MulThExample6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Thread name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MulThExample6());
        thread.start();
        System.out.println("Method main. Thread name is: " + Thread.currentThread().getName());
    }
}
