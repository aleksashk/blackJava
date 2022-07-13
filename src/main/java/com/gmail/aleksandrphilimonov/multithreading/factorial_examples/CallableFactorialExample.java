package com.gmail.aleksandrphilimonov.multithreading.factorial_examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFactorialExample {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial2 factorial = new Factorial2(6);
        Future<Integer> future = service.submit(factorial);
        try {
            factorialResult = future.get();
            System.out.println(factorialResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            service.shutdown();
        }
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Invalid value! " + f + ". It should be more than 0.");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
