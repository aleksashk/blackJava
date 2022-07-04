package com.gmail.aleksandrphilimonov.stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alex");
        stack.push("Mary");
        stack.push("Nick");
        stack.push("Kate");
        System.out.println(stack);
        System.out.println("*************************");
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println("*************************");
        System.out.println(stack);
    }
}
