package com.gmail.aleksandrphilimonov.queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Dmitry", 3);
        Student st5 = new Student("Nick", 4);
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());


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
