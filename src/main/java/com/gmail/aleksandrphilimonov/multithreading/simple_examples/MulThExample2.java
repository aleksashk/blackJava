package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class MulThExample2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("*********************" + getClass().getSimpleName() + " " + i);
        }
    }

    public static void main(String[] args) {
        MulThExample2 thread1 = new MulThExample2();
        thread1.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(MulThExample2.class.getSimpleName() + " " + i);
        }
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println("*********************" + getClass().getSimpleName() + " " + i);
//                }
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1000; i > 0; i--) {
//                    System.out.println(getClass().getSimpleName() + " " + i);
//                }
//            }
//        }).start();

    }
}
//
//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("*********************" + getClass().getSimpleName()+ " -> " + i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(getClass().getSimpleName()+ " -> " + i);
//        }
//    }
//}
