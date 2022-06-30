package com.gmail.aleksandrphilimonov.generics;

import java.util.ArrayList;
import java.util.List;

public class MainAppTest1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("OK");
        list.add(5);
        list.add(new StringBuilder("sb"));
        list.add(new Cat());

        for (Object o : list) {
            System.out.println(o + " " + ((String)o).length());
        }
    }
}

class Cat {
}
