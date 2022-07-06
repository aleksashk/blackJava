package com.gmail.aleksandrphilimonov.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExampleForeach {
    public static void main(String[] args) {
        int[] array = {5, 2, 6, 8, -1, 7, 0};
        Arrays.stream(array)
                .forEach(value -> {
                    System.out.println(value);
                    value *= 2;
                    System.out.println(value);
                    System.out.println("-------------------------------------------");
                });

        Arrays.stream(array)
                .forEach(Utils::meth);
    }
}

class Utils {
    public static void meth(int number) {
        System.out.println("number before operation = " + number);
        number += 5;
        System.out.println("number after operation = " + number);
    }
}
