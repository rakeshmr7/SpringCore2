package com.example.spring_core;


public class Engine {
    private int id;
    public Engine() {
    }
    public Engine(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void start() {
        System.out.println("Engine started");
    }
    @Override
    public String toString() {
        return "Engine [id=" + id + "]";
    }   
    
}
