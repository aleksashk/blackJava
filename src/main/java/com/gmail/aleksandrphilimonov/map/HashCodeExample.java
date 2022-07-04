package com.gmail.aleksandrphilimonov.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Cot", 3);
        Student st2 = new Student("Karina", "Loseva", 1);
        Student st3 = new Student("David", "Butova", 2);

        map.put(st1, 7.69);
        map.put(st2, 8.75);
        map.put(st3, 9.0);

        System.out.println(map);

        Student st4 = new Student("Davi", "Butova", 2);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println("st3.equals(st4): " + st3.equals(st4));

        System.out.println("-----------------------------");
        map.put(st4, 9.0);
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey().hashCode());
        }

        System.out.println("-----------------------------");
        System.out.println(st4.hashCode());
        Student st5 = new Student("Igor", "Sidoro", 2);
        map.put(st5, 7.8);

        System.out.println("-----------------------------");
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
//
    @Override
    public int hashCode() {
        return name.length() * 7 + surname.length() * 11 + course * 53;
    }
}
