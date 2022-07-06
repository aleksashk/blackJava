package com.gmail.aleksandrphilimonov.stream;

import java.util.stream.Stream;

public class StreamExampleConcat {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 3, 5, 7);
        Stream<Integer> s2 = Stream.of(-1, -2, 4, 0, -6, 7);
        Stream<Integer> s3 = Stream.of(100, 200, 100, 200, 100, 200, 300, 200, 300, 200, 200, 300, 200, 200, 300, 200, 300, 400);
        Stream<Integer> s4 = Stream.concat(s1, s2);
//        System.out.println(s4);
//        System.out.println(s3.distinct().collect(Collectors.toList()));
//        System.out.println(s3.count());
//        System.out.println(s3.distinct().count());

        System.out.println(s3.distinct().peek(System.out::println).count());
    }
}
