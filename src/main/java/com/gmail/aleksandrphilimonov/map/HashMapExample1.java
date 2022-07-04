package com.gmail.aleksandrphilimonov.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Pavel Petrov");
        map1.put(3560, "Alex Bring");
        map1.put(7854, "Dag Nickson");
        map1.put(4652, "James Vores");
        map1.put(9540, "Mat Ivanov");
        map1.put(9784, "Mat Ivanov");
        map1.put(3560, "Brad Pit");
        map1.putIfAbsent(3560, "Brad Pit");
        map1.put(null, "Dmitry Ring");
        System.out.println(map1.putIfAbsent(null, "Volodya Nosov"));
        System.out.println(map1);
        System.out.println(map1.get(9784));
        System.out.println(map1.remove(9784));
        System.out.println(map1);
        System.out.println(map1.containsValue("Brad Pit"));
        System.out.println(map1.containsKey(1540));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());
    }
}
