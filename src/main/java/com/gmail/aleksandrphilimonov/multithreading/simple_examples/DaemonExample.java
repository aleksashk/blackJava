package com.gmail.aleksandrphilimonov.multithreading.simple_examples;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " starts");
        UserThread userThread = new UserThread();
        userThread.setName("UserThread");
        userThread.start();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(3000);
                System.out.println("i = " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println("i = ************************************" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
