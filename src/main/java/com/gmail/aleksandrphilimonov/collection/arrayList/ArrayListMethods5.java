package com.gmail.aleksandrphilimonov.collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("someString1");
        arrayList1.add("someString2");
        arrayList1.add("someString3");
        arrayList1.add("someString4");
        arrayList1.add("someString77");
        System.out.println(arrayList1);

        List<String> myList = arrayList1.subList(1, 4);
        System.out.println(myList);
        myList.add("4444");
        System.out.println(arrayList1);
        System.out.println(myList);
//        arrayList1.add("55555");
        System.out.println(arrayList1);
//        System.out.println(myList);
        Object[] oArray = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);
        System.out.println(Arrays.toString(array2));

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("someString2");
//        arrayList2.add("someString3");
//        arrayList2.add("333333");
//        System.out.println(arrayList2);

//        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        boolean result = arrayList1.containsAll(arrayList2);
//
//        System.out.println(result);

//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        System.out.println(list);
//        list.add(100);--->wrong
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
//        List<Integer> list = List.of(1, null, 2, 3, 4, 5); --->wrong
//        System.out.println(list);
    }
}
