package com.gmail.aleksandrphilimonov.nested_classes;

public class Test {
    static class A{}//static nested class
    class B{}//inner class

    void method (){
        class C{}//local class
    }
}
