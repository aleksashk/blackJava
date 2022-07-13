package com.gmail.aleksandrphilimonov.multithreading.callable_example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumExample {

    private static long value = 1000_000_000;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = value / 10;

        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = service.submit(task);
            futureResults.add(futurePartSum);
        }

        for (Future<Long> result : futureResults) {
            sum += result.get();
        }
        System.out.println("Total sum: " + sum);
        service.shutdown();
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("sum from " + from + " to " + to + " =\t" + localSum + ";");
        return localSum;
    }
}