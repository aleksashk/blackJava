package com.gmail.aleksandrphilimonov.nested_classes.local_inner_class;

public class LocalInnerClassExample {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(26, 5);
    }
}

class Math {
    public void getResult(final int delimoe, final int delitel) {
        class Delenie {
            public int getChasnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chasnoe = " + delenie.getChasnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}