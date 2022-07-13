package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Meth main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join(10000);
        System.out.println(thread.getState());
        System.out.println("Meth main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("work ends");
    }
}
