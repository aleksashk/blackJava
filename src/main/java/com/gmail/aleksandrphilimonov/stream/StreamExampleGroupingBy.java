package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleGroupingBy {
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

        Map<Integer, List<SimpleStudent>> map = list.stream()
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<SimpleStudent>> e: map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
