package com.gmail.aleksandrphilimonov.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAppTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("George");
        list.add("Richard");
        list.add("Alex");
        list.add("Nicolay");
        list.add("Mariya");
        System.out.print("Before sort: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.print("After sort: ");
        System.out.println(list);

    }
}
