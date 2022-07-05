package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);
        System.out.println("---------------");

        list.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("---------------");

        List<Integer> iList = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(iList);

        int[] array = {1, 2, 4, 6, -9};
        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element /= 3;
                    }
                    return element;
                }).toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("-------------------");
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OK");
        set.add("poka");

        System.out.println(set);

        set.stream()
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("--------------------------");
        Set<Integer> iSet = set.stream()
                .map(String::length)
                .collect(Collectors.toSet());

        System.out.println(iSet);
    }
}
