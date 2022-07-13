package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample5 {
    public static void main(String[] args) {
        Thread myThread5 = new MyThread5();
        myThread5.start();
        System.out.println("Name of myThread5: " + myThread5.getName() + ". Priority of myThread5: " + myThread5.getPriority());

        myThread5.setName("MyThread!");
        myThread5.setPriority(9);
        System.out.println("Name of myThread5: " + myThread5.getName() + ". Priority of myThread5: " + myThread5.getPriority());
        myThread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of myThread5: " + myThread5.getName() + ". Priority of myThread5: " + myThread5.getPriority());
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread5: " + myThread5.getName() + ". Priority of myThread5: " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello!!!!");
    }
}