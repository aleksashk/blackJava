package com.gmail.aleksandrphilimonov.generics.igra;

public class MainAppTest {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Vicka", 12);
        Schoolar schoolar3 = new Schoolar("Julia", 11);
        Schoolar schoolar4 = new Schoolar("Helen", 10);

        Student student1 = new Student("Pavel", 19);
        Student student2 = new Student("Boris", 20);

        Employee employee1 = new Employee("Elena", 34);
        Employee employee2 = new Employee("Valeriya", 29);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        Team<Schoolar> schoolarTeam2 = new Team<>("Geniuses");
        Team<Student> studentTeam = new Team<>("Go-Go-Go");
        Team<Employee> employeeTeam = new Team<>("Workers");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
