package com.gmail.aleksandrphilimonov.lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Kak dela?");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno Lambdas");
        System.out.println(al);
        al.removeIf(s -> s.length() > 5);
        System.out.println("-------------------------");
        System.out.println(al);

    }
}
