package com.lecture.constructors;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car("Ford", 2010);
       
        // if we define constructor explicitly in the class, we no longer
        // have any default constructor
       // Car toyota = new Car();
        Car toyota = new Car(2020);
       
    }
}
