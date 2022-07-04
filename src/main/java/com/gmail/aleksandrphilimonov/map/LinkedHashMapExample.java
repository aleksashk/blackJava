package com.gmail.aleksandrphilimonov.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Alex", "Ivanov", 3);
        Student st2 = new Student("Boris", "Borisov", 1);
        Student st3 = new Student("David", "Davidov", 2);
        Student st4 = new Student("Richard", "Gir", 3);

        linkedHashMap.put(8.5, st4);
        linkedHashMap.put(6.1, st2);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(7.2, st3);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(6.1));
        System.out.println(linkedHashMap.get(7.2));
        System.out.println(linkedHashMap);

    }
}
