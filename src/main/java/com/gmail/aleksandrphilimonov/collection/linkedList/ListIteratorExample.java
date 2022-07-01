package com.gmail.aleksandrphilimonov.collection.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String string = "Medam";
        List<Character> list = new LinkedList<>();
        for (char ch : string.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> listIteratorReverse = list.listIterator(list.size());
        String msg = string + " is palindrome";
        while (listIterator.hasNext() & listIteratorReverse.hasPrevious()) {
            if (Character.toLowerCase(listIterator.next()) != Character.toLowerCase(listIteratorReverse.previous())) {
                msg = string + " isn't a palindrome.";
                break;
            }
        }
        System.out.println(msg);
    }
}
