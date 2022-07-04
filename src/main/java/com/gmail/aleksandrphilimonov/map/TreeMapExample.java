package com.gmail.aleksandrphilimonov.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Alex", "Ivanov", 3);
        Student st2 = new Student("Boris", "Borisov", 1);
        Student st3 = new Student("David", "Davidov", 2);
        Student st4 = new Student("Richard", "Gir", 3);
        Student st5 = new Student("Nick", "Apolin", 1);
        Student st6 = new Student("Zoui", "Nosickova", 4);
        Student st7 = new Student("Nicka", "Cool", 2);

        treeMap.put(5.8, st1);
        treeMap.put(6.1, st2);
        treeMap.put(7.2, st3);
        treeMap.put(8.5, st4);
        treeMap.put(6.0, st6);
        treeMap.put(7.0, st5);
        treeMap.put(4.8, st7);

        System.out.println(treeMap);

        for (Map.Entry<Double, Student> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

//        System.out.println(treeMap.get(6.1));
//        System.out.println(treeMap.remove(4.8));
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//
//        System.out.println(treeMap.tailMap(6.));
//        System.out.println(treeMap.headMap(6.));
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.lastEntry());
//        treeMap.put(7.4, st5);
//
//        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
//        Student st12 = new Student("Alex", "Ivanov", 3);
//        Student st22 = new Student("Boris", "Borisov", 1);
//        Student st32 = new Student("David", "Davidov", 2);
//        Student st42 = new Student("Richard", "Gir", 3);
//        Student st52 = new Student("Nick", "Apolin", 1);
//        Student st62 = new Student("Zoui", "Nosickova", 4);
//        Student st72 = new Student("Nicka", "Cool", 2);
//        Student st82 = new Student("Nicka", "Cool", 2);
//
//        treeMap2.put(st12, 5.8);
//        treeMap2.put(st32, 7.2);
//        treeMap2.put(st22, 6.1);
//        treeMap2.put(st72, 4.8);
//        treeMap2.put(st42, 8.5);
//        treeMap2.put(st62, 6.0);
//        treeMap2.put(st52, 7.4);
//        treeMap2.put(st82, 7.4);
//
//        System.out.println(treeMap2);
//
//        System.out.println(st72.equals(st82));
//        System.out.println(treeMap2.containsKey(st82));
//
//        TreeMap<Student, Double> treeMap3 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o1.name.compareTo(o2.name);
//                if(result == 0){
//                    return o1.surname.compareTo(o2.surname);
//                }
//                return result;
//            }
//        });

    }
}
