package com.gmail.aleksandrphilimonov.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Oleg");
        set.add("Mary");
        set.add("Helen");

        set.add("Helen");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (String s : set) {
            System.out.println(s);
        }
        set.add(null);
        System.out.println("---------------------");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        set.remove(null);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        System.out.println(set.size());
        System.out.println("set.isEmpty: " + set.isEmpty());
        System.out.println("set.contains(George): " + set.contains("George"));

    }
}
