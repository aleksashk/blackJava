package com.gmail.aleksandrphilimonov.generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>(); wrong
//        List<Object> list = new ArrayList<Integer>(); wrong
        List<?> list = new ArrayList<Integer>();
//        list.add("Hello");    ---> wrong

        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? super Number> list6 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(2.956);
        list1.add(231.901);
        list1.add(-75.08);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Buy");
        list2.add("See you");
        showListInfo(list2);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(32.75);
        arrayList.add(-12.08);
        arrayList.add(15.002);
        arrayList.add(-4.912);
        System.out.println(summ(arrayList));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(32);
        arrayList1.add(-12);
        arrayList1.add(15);
        arrayList1.add(-42);
        System.out.println(summ(arrayList1));

        ArrayList<String> arrayList2 = new ArrayList<>();
//        System.out.println(summ(arrayList2)); ---> wrong!!

    }

    static void showListInfo(List<?> list) {
        System.out.println("List contains next elements: " + list);

    }

    public static double summ(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
