package com.company;

public class StudentBuilder {
    private String name;
    private String classs;
    private boolean gf;
    private String cgpa;
    private String roll;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder setClass(String classs){
        this.classs = classs;
        return this;
    }
    public StudentBuilder setGF(boolean gf){
        this.gf = gf;
        return this;
    }
    public StudentBuilder setCGPA(String cgpa){
        this.cgpa = cgpa;
        return this;
    }
    public StudentBuilder setGF(String roll){
        this.roll = roll;
        return this;
    }

    public Student getStudent(){
        return new Student(name,classs,gf,cgpa,roll);
    }

}
