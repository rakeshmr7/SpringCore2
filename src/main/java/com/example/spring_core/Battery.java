package com.example.spring_core;

public class Battery {
    private int id;
    private String brand;
    public Battery() {
    }

    public Battery(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Battery [id=" + id + ", brand=" + brand + "]";
    }
    
}
