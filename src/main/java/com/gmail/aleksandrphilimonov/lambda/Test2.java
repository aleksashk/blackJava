package com.gmail.aleksandrphilimonov.lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def(String::length);
    }
}
interface I{
    int abc(String s);
}