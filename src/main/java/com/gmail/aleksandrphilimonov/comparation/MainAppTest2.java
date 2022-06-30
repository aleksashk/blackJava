package com.gmail.aleksandrphilimonov.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainAppTest2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Richard", "Jonson", 15400);
        Employee emp2 = new Employee(15, "Brus", "Morison", 11200);
        Employee emp3 = new Employee(123, "Chack", "Abrams", 19600);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.print("Before sort: ");
        System.out.println(list);
        System.out.print("After sort: ");
        Collections.sort(list, new IdComparator());
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);
        Collections.sort(list,new SurnameComparator());
        System.out.println(list);
    }
}

class Employee {
    //        implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "id=" + id +
                ", name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", salary: " + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        }
//        return this.id - anotherEmp.id;
//        return this.id.compareTo(anotherEmp.id);
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
//    }

}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surname.compareTo(o2.surname);
    }
}
