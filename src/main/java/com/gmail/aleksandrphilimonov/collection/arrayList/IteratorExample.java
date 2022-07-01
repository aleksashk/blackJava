package com.gmail.aleksandrphilimonov.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("someString1");
        arrayList1.add("someString2");
        arrayList1.add("someString3");
        arrayList1.add("someString4");
        arrayList1.add("someString77");

        Iterator<String> iterator = arrayList1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(arrayList1);


    }
}
