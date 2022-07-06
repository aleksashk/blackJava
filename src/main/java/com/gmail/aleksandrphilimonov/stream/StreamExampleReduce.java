package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExampleReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream()
                .reduce((accumulator, element) -> accumulator * element)
                .get());

        List<Integer> list1 = new ArrayList<>();
//        int result1 = list1
//                .stream()
//                .reduce((ac, el) -> ac + el)
//                .get();
        Optional<Integer> optional = list1
                .stream()
                .reduce((ac, el) -> ac + el);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("not present");
        }

        Optional<Integer> optional1 = list
                .stream()
                .reduce((ac, el) -> ac + el);
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        } else {
            System.out.println("not present");
        }

        int result2 = list
                .stream()
                .reduce(1, (ac, el) -> ac + el);
        System.out.println(result2);

        List<String> sList = Arrays.asList("privet", "poka", "ok", "kak dela?");
        String s = sList.stream()
                .reduce("", (ac, val) -> ac.concat(val));
        s = s.replace(" ", "_");
        System.out.println(s);
    }
}
