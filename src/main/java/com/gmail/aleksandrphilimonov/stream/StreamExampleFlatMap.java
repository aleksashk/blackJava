package com.gmail.aleksandrphilimonov.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExampleFlatMap {
    public static void main(String[] args) {
        SimpleStudent student1 = new SimpleStudent("Ivan", 'm', 22, 3, 8.3);
        SimpleStudent student2 = new SimpleStudent("Nikolay", 'm', 28, 2, 6.2);
        SimpleStudent student3 = new SimpleStudent("Elena", 'f', 19, 1, 8.9);
        SimpleStudent student4 = new SimpleStudent("Petr", 'm', 35, 4, 7.0);
        SimpleStudent student5 = new SimpleStudent("Mary", 'f', 23, 3, 9.1);
        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");

        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f1.addStudentToFaculty(student3);
        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.name));
    }
}

class SimpleStudent {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public SimpleStudent(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "SimpleStudent{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class Faculty {
    String name;
    List<SimpleStudent> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<SimpleStudent> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(SimpleStudent student) {
        studentsOnFaculty.add(student);
    }
}
