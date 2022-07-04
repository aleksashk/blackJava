package com.gmail.aleksandrphilimonov.map;

import java.util.Hashtable;

public class HashTableEzample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<>();

        Student st1 = new Student("Alex", "Ivanov", 3);
        Student st2 = new Student("Boris", "Borisov", 1);
        Student st3 = new Student("David", "Davidov", 2);
        Student st4 = new Student("Richard", "Gir", 3);

        hashTable.put(8.5, st1);
        hashTable.put(6.1, st2);
        hashTable.put(5.8, st3);
//        hashTable.put(null, st4);
        hashTable.put(6.8, st4);
        System.out.println(hashTable);
    }
}
