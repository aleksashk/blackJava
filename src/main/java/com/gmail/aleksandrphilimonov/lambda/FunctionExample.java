package com.gmail.aleksandrphilimonov.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
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

//        Function<Student, Double> function = new Function<Student, Double>() {
//            @Override
//            public Double apply(Student student) {
//                return student.avgGrade;
//            }
//        };
        Function<Student, Double> function = student -> student.avgGrade;
        double result = avgSomething(students, function);
        System.out.println(result);
    }

    private static double avgSomething(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student s : list) {
            result += function.apply(s);
        }
        result /= list.size();
        return result;
    }
}
