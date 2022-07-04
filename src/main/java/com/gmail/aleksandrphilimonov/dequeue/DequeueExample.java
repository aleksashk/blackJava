package com.gmail.aleksandrphilimonov.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        System.out.println(deque);
        deque.addLast(5);
        System.out.println(deque);
        deque.addFirst(1);
        System.out.println(deque);
        deque.addLast(7);
        System.out.println(deque);
        deque.addFirst(10);
        System.out.println(deque);
        deque.offerFirst(101);
        System.out.println(deque);
        deque.offerLast(10101);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
