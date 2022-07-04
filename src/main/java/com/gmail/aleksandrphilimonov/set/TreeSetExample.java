package com.gmail.aleksandrphilimonov.set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
//        set.add(5);
//        set.add(8);
//        set.add(2);
//        set.add(1);
//        set.add(10);
//        set.add(null);

        Student st1 = new Student("Jacov", 2);
        Student st2 = new Student("Vika", 1);
        Student st3 = new Student("Devid", 2);
        Student st4 = new Student("Fedor", 3);
        Student st5 = new Student("Boris", 4);
        Student st6 = new Student("Alex", 5);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        treeSet.add(st6);
        Student st7 = new Student("Oleg", 4);
        Student st8 = new Student("Ivan", 5);

        for (Student s : treeSet) {
            System.out.println(s);
        }
//
//        System.out.println(set.remove(2));
//        System.out.println(set.contains(2));
        System.out.println("---------------");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println("---------------");
        System.out.println(treeSet.headSet(st7));
        System.out.println("---------------");
        System.out.println(treeSet.tailSet(st7));
        System.out.println("---------------");
        System.out.println(treeSet.subSet(st1, st8));
        System.out.println("---------------");
        System.out.println(st1.equals(st3));

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.course, o.course);
    }
}
