package com.example.tpekschedulemanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students;
    private Student currentStudent;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public Student getStudentByLogin(String login) {
        for (Student student : students) {
            if (student.getLogin().equals(login)) {
                return student;
            }
        }
        return null;
    }


    public Student checkAuth(String login, String password) {
        for (Student student : students) {
            if (student.getLogin().equals(login) &&
                    student.getPassword().equals(password)) {
                currentStudent = student;
                return student;
            }
        }
        return null;
    }
}
