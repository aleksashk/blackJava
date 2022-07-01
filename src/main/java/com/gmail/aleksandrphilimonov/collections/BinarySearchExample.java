package com.gmail.aleksandrphilimonov.collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

//        List<Employee> employeeList = new ArrayList<>();
//        Employee emp1 = new Employee(100, "Polina", 12345);
//        Employee emp2 = new Employee(70, "Vicka", 2345);
//        Employee emp3 = new Employee(80, "Julia", 4567);
//        Employee emp4 = new Employee(70, "Sonya", 15367);
//        Employee emp5 = new Employee(60, "Elena", 94567);
//        Employee emp6 = new Employee(50, "Olga", 74344);
//        Employee emp7 = new Employee(70, "Janna", 5320);
//
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//
//        Collections.sort(employeeList);
//
//        System.out.println(employeeList);
//
//        int index2 = Collections.binarySearch(employeeList, new Employee(80, "Julia", 4567));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        int index = Arrays.binarySearch(array, 1);
//        System.out.println(Arrays.toString(array));
//        System.out.println(index);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = Integer.compare(this.id, o.id);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}