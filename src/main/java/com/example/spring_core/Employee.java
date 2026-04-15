package com.example.spring_core;

import java.util.Set;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {
    private int id;
    private String name;
    private double sal;
    private String projects[];
    private Set<String> skillSet;
    
    public Employee() {
    }
    public Employee(int id, String name, double sal, String[] projects, Set<String> skillSet) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.projects = projects;
        this.skillSet = skillSet;
    }
    //for bean lifecycle
    @PostConstruct //Another way to specify the init method without mentioning it in the xml file. We can use this annotation on any method and that method will be called as the init method.
    public void start(){// can be any name but it should be same as the method name in the xml file
        System.out.println("Employee started working");
    }
    
    // for bean lifecycle
    @PreDestroy //Another way to specify the destroy method without mentioning it in the xml file. We can use this annotation on any method and that method will be called as the destroy method.
    public void stop(){//can be any name but it should be same as the method name in the xml file
        System.out.println("Employee stopped working");
    }

    public int getId() {
        return id;
    }
    public String[] getProjects() {
        return projects;
    }
    public void setProjects(String[] projects) {
        this.projects = projects;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", projects=" + java.util.Arrays.toString(projects) + ", skillSet=" + skillSet + "]";
    }
    public Set<String> getSkillSet() {
        return skillSet;
    }
    public void setSkillSet(Set<String> skillSet) {
        this.skillSet = skillSet;
    }
    
}
