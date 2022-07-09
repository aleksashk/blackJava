package com.gmail.aleksandrphilimonov.multithreading;

public class MulThExample7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        System.out.println("Ready!!!");
        Thread.sleep(1000);
        System.out.println("Steady!!!");
        Thread.sleep(1000);
        System.out.println("Go!!!");
    }
}
