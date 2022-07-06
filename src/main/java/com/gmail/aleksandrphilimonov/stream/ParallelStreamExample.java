package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce((ac, el) -> ac += el)
                .get();
        System.out.println("sum = " + sumResult);

        double parallelSumResult = list.parallelStream()
                .reduce((ac, el) -> ac += el)
                .get();
        System.out.println("sum = " + parallelSumResult);

        double divisionResult = list.stream()
                .reduce((ac, el) -> ac /= el)
                .get();
        System.out.println("divisionResult = " + divisionResult);

        double parallelDivisionResult = list.parallelStream()
                .reduce((ac, el) -> ac /= el)
                .get();
        System.out.println("parallelDivisionResult = " + parallelDivisionResult);

    }
}
