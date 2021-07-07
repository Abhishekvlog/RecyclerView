package com.example.recyclerviewwe;

public class Student {
    private String name;
    private int age;
    private String roll_no;

    public Student(String name, int age, String roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRoll_no() {
        return roll_no;
    }
}
