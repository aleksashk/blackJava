package com.gmail.aleksandrphilimonov.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> aList1 = new ArrayList<>();
        aList1.add(10);
        aList1.add(20);
        aList1.add(30);
        int a = GenMethod.getSecondElement(aList1);
        System.out.println(a);

        ArrayList<String> aList2 = new ArrayList<>();
        aList2.add("A");
        aList2.add("BB");
        aList2.add("CCC");
        String string = GenMethod.getSecondElement(aList2);
        System.out.println(string);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> aList) {
        return aList.get(1);
    }
}

class AnotherGenMethod<V> {
    public V getSecondElement(ArrayList<V> aList) {
        return aList.get(1);
    }
}