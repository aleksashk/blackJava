package com.gmail.aleksandrphilimonov.lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> a1, StudentChecks sc) {
        for (Student s : a1) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
//        for (Student s : a1) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
//        for (Student s : a1) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
//        for (Student s : a1) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.7);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);

        StudentInfo si = new StudentInfo();
        si.testStudents(students, new CheckOverGrade());
        System.out.println("---------------------");
        si.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
//        System.out.println("-----------------------");
//        si.printStudentsOverGrade(students, 8);
//        System.out.println("-----------------------");
//        si.printStudentsUnderAge(students, 30);
//        System.out.println("-----------------------");
//        si.printStudentsMixCondition(students, 20, 9.5, 'f');
//        System.out.println("-----------------------");
    }
}

interface StudentChecks {
    boolean check(Student s);
}