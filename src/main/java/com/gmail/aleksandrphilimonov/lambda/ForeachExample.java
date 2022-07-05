package com.gmail.aleksandrphilimonov.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "kak dela", "normm", "poka");
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("----------------------------------");
        for (Integer i : list2) {
            System.out.println(i);
            i *= 2;
            System.out.println("*******");
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        list2.forEach(item -> {
            System.out.println(item);
            item *= 2;
            System.out.println(item);
            System.out.println("*******");
        });

    }
}
