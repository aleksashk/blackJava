package com.gmail.aleksandrphilimonov.collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("someString1");
        arrayList1.add("someString2");
        arrayList1.add("someString3");
        arrayList1.add("someString3");
        arrayList1.add("someString4");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//
//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.addAll(2, arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
//        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("someString3"));
        System.out.println(arrayList1.lastIndexOf("someString3"));
        System.out.println(arrayList1.size());
//        System.out.println(arrayList1.isEmpty());
//        arrayList1.clear();
//        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("someString2"));
    }
}
