package com.lecture.constructors;

public class Car {
    private String model;
    private int year;
    
    // defining explicit constructor replaces the default constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    // overloading the constructor (signature changes)
    public Car(int year, String model) {
        this.model = model;
        this.year = year;
    }
    
    // overloading the constructor (signature changes)
    public Car(String model) {
        this.model = model;
    }
    
    // overloaded constructor (signature changes)
    public Car(int year) {
        this.year = year;
    }
    
    // if you need a default constructor, you have declare it explicitly, unless
    // you don't have any other constructor defined
}
