package com.gmail.aleksandrphilimonov.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Ivan", lock);
        new Employee("Helen", lock);
        new Employee("Olga", lock);

        Thread.sleep(5000);

        new Employee("Richard", lock);
        new Employee("Steven", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " is waiting...");
//            lock.lock();
                System.out.println(name + " is using ATM");
                Thread.sleep(2000);
                System.out.println(name + " finished");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want waiting in the queue");
        }
    }
}