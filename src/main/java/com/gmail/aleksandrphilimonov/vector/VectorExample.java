package com.gmail.aleksandrphilimonov.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Alex");
        vector.add("Misha");
        vector.add("Evgenij");
        vector.add("Nick");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println(vector.get(1));
    }
}
