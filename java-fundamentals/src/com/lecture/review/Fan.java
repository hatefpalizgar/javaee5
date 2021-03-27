package com.lecture.review;

public class Fan {
    // declare constants
    // convention in Java: all constant fields are better to be all CAPITALIZED
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean isTurnedOn;
    private double radius;
    
    // declare and initialize a variable on the same line, we call it 'in-line initialization'
    private String color = "Blue" ;
    
    // no-arg|default  constructor
    public Fan() {
        this.speed = SLOW;
        this.isTurnedOn = false;
        this.radius = 5;
    }
}
