package com.gmail.aleksandrphilimonov.generics.subtyping;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        X x = new Y();
//        List<X> list1 = new ArrayList<Y>(); ---> wrong!!!
        List<X> list2 = new ArrayList<>();
//        List<Number> list = new ArrayList<Integer>(); ---> wrong!!!
//        list2.add(18);
//        list2.add(3.14);
    }
}
class X{

}
class Y extends X{

}