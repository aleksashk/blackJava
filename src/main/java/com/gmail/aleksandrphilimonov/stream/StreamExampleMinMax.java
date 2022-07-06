package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

//        list.stream()
//                .filter(e -> e.getAge() > 20)
//                .forEach(System.out::println);
//        System.out.println("---------------------------------");
//         list.stream()
//                .filter(e -> e.getAge() > 20)
//                .limit(2)
//                .forEach(System.out::println);
//        System.out.println("---------------------------------");
//        list.stream()
//                .filter(e -> e.getAge() > 20)
//                .skip(2)
//                .forEach(System.out::println);

        List<Integer> courses = list.stream()
                .mapToInt(SimpleStudent::getCourse)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        List<Double> avgGrades = list.stream()
                .mapToDouble(SimpleStudent::getAvgGrade)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(avgGrades);

        int sum = list.stream()
                .mapToInt(SimpleStudent::getCourse)
                .sum();
        System.out.println(sum);

        double totalGrade = list.stream()
                .mapToDouble(SimpleStudent::getAvgGrade)
                .sum();
        System.out.println(totalGrade);

        double average = list.stream()
                .mapToInt(SimpleStudent::getCourse)
                .average().getAsDouble();
        System.out.println(average);

        int min = list.stream()
                .mapToInt(SimpleStudent::getCourse)
                .min().getAsInt();
        System.out.println(min);

        int max = list.stream()
                .mapToInt(SimpleStudent::getCourse)
                .max().getAsInt();
        System.out.println(max);
    }
}
