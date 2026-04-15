package com.example.spring_core;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private String color;
    // @Autowired
    Engine engine;
    public Car() {
    }
    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car [color=" + color + ", engine=" + engine + "]";
    }
    

}
