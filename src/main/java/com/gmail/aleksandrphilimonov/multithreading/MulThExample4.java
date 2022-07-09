package com.gmail.aleksandrphilimonov.multithreading;

public class MulThExample4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(getClass().getSimpleName() + " Hello");
            }
        }).start();

        new Thread(() -> System.out.println(MulThExample4.class.getSimpleName() + " hello")).start();
        System.out.println("Hi");
    }
}
