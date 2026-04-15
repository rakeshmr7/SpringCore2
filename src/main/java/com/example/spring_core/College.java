package com.example.spring_core;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
    private int c_id;
    private String c_name;

    // @Autowired
    private Student student;
    public College() {
    }
    
    public College(int c_id, String c_name, Student student) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.student = student;
    }

    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString() {          
        return "College [c_id=" + c_id + ", c_name=" + c_name + ", student=" + student + "]";
    }
    
}
