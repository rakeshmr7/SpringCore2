package com.example.spring_core;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {
    private int id;
    private String brand;
    private double price;

    // @Autowired
    private Battery battery;
    public Mobile() {
    }

    public Mobile(int id, String brand, double price, Battery battery) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.battery = battery;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + ", battery=" + battery + "]";
    }
    


}
