package com.gmail.aleksandrphilimonov.collection.arrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("someString1");
        arrayList1.add("someString2");
        arrayList1.add("someString3");
        arrayList1.add("someString4");
        arrayList1.add(0, "someString5");
        arrayList1.add(2, "someString6");

        System.out.println("***********************************");
        System.out.println(arrayList1.get(0));
        System.out.println("***********************************");
        arrayList1.set(0, "another string");
        System.out.println(arrayList1.get(0));

        System.out.println("***********************************");
        System.out.println(arrayList1.remove(0));
        System.out.println("***********************************");
        System.out.println(arrayList1);

        for (String s : arrayList1) {
            System.out.println(s);
        }
        System.out.println("***********************************");
        System.out.println(arrayList1.get(arrayList1.size() - 1));
        System.out.println("***********************************");

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

    }
}

