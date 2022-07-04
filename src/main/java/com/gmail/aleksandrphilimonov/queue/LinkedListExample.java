package com.gmail.aleksandrphilimonov.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        queue.add("Helen");
        queue.add("Mary");
        queue.add("Alex");
        queue.add("Bob");
        queue.add("Mike");
        System.out.println(queue);

        queue2.offer("Helen");
        queue2.offer("Mary");
        queue2.offer("Alex");
        queue2.offer("Bob");
        queue2.offer("Mike");
        System.out.println(queue2);
        System.out.println("----------------------");
        System.out.println("queue.remove(): " + queue2.remove());
        System.out.println("queue.element(): " + queue2.element());
        System.out.println("----------------------");
        System.out.println("queue.remove(): " + queue2.remove());
        System.out.println("queue.element(): " + queue2.element());
        System.out.println("----------------------");
        System.out.println("queue.remove(): " + queue2.remove());
        System.out.println("queue.element(): " + queue2.element());
        System.out.println("----------------------");
        System.out.println("queue.remove(): " + queue2.remove());
        System.out.println("queue.element(): " + queue2.element());
        System.out.println("----------------------");
        System.out.println(queue2);
//        System.out.println("--------------------");
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue);

    }
}
