package com.example.tpekschedulemanagement;

public class StudentList {

    private StudentManager manager;

    public StudentList() {
        manager = new StudentManager();

        Student student = new Student(
                "Яковлев", "Захар", "Андреевич",
                4,
                1,
                "09.02.07 Информационные системы и программирование",
                "zakari", "1234"
        );

        String fio = student.getFullName();
        String group = student.getGroup();
        int course = student.getCourse();


        manager.addStudent(student);
    }

    public StudentManager getManager() {
        return manager;
    }
}
