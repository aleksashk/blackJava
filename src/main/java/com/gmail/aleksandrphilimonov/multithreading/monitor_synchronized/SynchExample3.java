package com.gmail.aleksandrphilimonov.multithreading.monitor_synchronized;

public class SynchExample3 {
    synchronized void mobileCall() {
        System.out.println("mobile calls starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mobile call ends");
    }

    synchronized void viberCall() {
        System.out.println("viber calls starts");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("viber call ends");
    }

    synchronized void watsAppCall() {
        System.out.println("watsApp calls starts");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("watsApp call ends");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableImplementationMobile());
        t1.start();
        Thread t2 = new Thread(new RunnableImplementationViber());
        t2.start();
        Thread t3 = new Thread(new RunnableImplementationWatsApp());
        t3.start();
    }
}

class RunnableImplementationMobile implements Runnable {

    @Override
    public void run() {
        new SynchExample3().mobileCall();
    }
}

class RunnableImplementationViber implements Runnable {

    @Override
    public void run() {
        new SynchExample3().viberCall();
    }
}

class RunnableImplementationWatsApp implements Runnable {

    @Override
    public void run() {
        new SynchExample3().watsAppCall();
    }
}
