package com.gmail.aleksandrphilimonov.generics.firstLesson;

import java.util.ArrayList;
import java.util.List;

public class MainAppTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OK");
        list.add("" + 5);
        list.add(new StringBuilder("sb").toString());
        list.add(new Cat().toString());

        for (String o : list) {
            System.out.println(o + " " + o.length());
        }
    }
}

class Cat {
}
