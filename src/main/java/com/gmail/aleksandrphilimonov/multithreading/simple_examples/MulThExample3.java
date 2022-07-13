package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread11());
        Thread thread2 = new Thread(new MyThread22());

        thread1.start();
        thread2.start();
    }
}

class MyThread11 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("********" + getClass().getSimpleName() + " -> " + i);
        }
    }
}

class MyThread22 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getClass().getSimpleName() + " -> " + i);
        }
    }
}
