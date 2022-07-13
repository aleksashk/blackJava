package com.gmail.aleksandrphilimonov.multithreading.factorial_examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorialExample {
    public static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        service.execute(factorial);
        service.shutdown();
        service.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Invalid value. f should be more than 0.");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorialExample.factorialResult = result;
    }
}
