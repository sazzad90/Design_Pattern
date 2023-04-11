package com.company;

public class Student {
    private String name;
    private String classs;
    private boolean gf;
    private String cgpa;
    private String roll;

    public Student(String name, String classs, boolean gf, String cgpa, String roll) {
        this.name = name;
        this.classs = classs;
        this.gf = gf;
        this.cgpa = cgpa;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", gf=" + gf +
                ", cgpa='" + cgpa + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
