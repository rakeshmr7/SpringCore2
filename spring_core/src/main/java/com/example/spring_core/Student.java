package com.example.spring_core;

import java.util.Map;

public class Student {
    private int rollno;
    private String name;
    private double marks;
    private Map<String, Integer> termMarks;
    public Student() {
    }
    public Student(int rollno, String name, double marks, Map<String, Integer> termMarks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.termMarks = termMarks;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public Map<String, Integer> getTermMarks() {
        return termMarks;
    }
    public void setTermMarks(Map<String, Integer> termMarks) {
        this.termMarks = termMarks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", TermMarks=" + termMarks + "]";
    }
}
