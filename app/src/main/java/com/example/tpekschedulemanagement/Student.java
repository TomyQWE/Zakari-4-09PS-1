package com.example.tpekschedulemanagement;

public class Student {
    private String lastName;
    private String firstName;
    private String middleName;
    private int course;
    private int numberGroup;
    private String specialization;
    private String login;
    private String password;

    public Student(String lastName, String firstName, String middleName,
                   int course, int numberGroup, String specialization,
                   String login, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.course = course;
        this.numberGroup = numberGroup;
        this.specialization = specialization;
        this.login = login;
        this.password = password;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        String specialtyCode = specialization.substring(0, 2);
        return course + "-" + specialtyCode + "ПС" + numberGroup;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
