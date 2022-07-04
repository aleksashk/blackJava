package com.gmail.aleksandrphilimonov.nested_classes.anonimus_class;

public class AnonimusClassExample {
    public static void main(String[] args) {
        Math2 m = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(10, 20));
        Math2 m2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(10, 20));
        System.out.println(m2.doOperation(10, 20));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}