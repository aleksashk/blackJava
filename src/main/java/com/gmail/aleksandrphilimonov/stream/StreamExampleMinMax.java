package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExampleMinMax {
    public static void main(String[] args) {
        SimpleStudent student1 = new SimpleStudent("Ivan", 'm', 22, 3, 8.3);
        SimpleStudent student2 = new SimpleStudent("Nikolay", 'm', 28, 2, 6.2);
        SimpleStudent student3 = new SimpleStudent("Elena", 'f', 19, 1, 8.9);
        SimpleStudent student4 = new SimpleStudent("Petr", 'm', 35, 4, 7.0);
        SimpleStudent student5 = new SimpleStudent("Mary", 'f', 23, 3, 9.1);

        List<SimpleStudent> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

//        SimpleStudent min = list.stream()
//                .min(Comparator.comparingInt(SimpleStudent::getAge)).get();
//        System.out.println(min);
//
//        SimpleStudent max = list.stream()
//                .max(Comparator.comparingInt(SimpleStudent::getAge)).get();
//        System.out.println(max);

        list.stream()
                .filter(e -> e.getAge() > 20)
                .limit(2)
                .forEach(System.out::println);
    }
}
