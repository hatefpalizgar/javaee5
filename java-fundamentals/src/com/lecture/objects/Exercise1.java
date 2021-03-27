package com.lecture.objects;
// exercise1:
// declare a class called Student with field like firstName (String), lastName(String) and age(int)
// inside the main method instantiate a Student object
// use setters and getters to set the fields and printing them to the console

public class Exercise1 {
    public static void main(String[] args) {
        // instantiate a Student instance
        Person teacher = new Person();
        teacher.age = 10;
        teacher.lastName = "another lastname";
        
        // teacher is our object reference variable
        
        teacher.setFirstName("Hatef");
        teacher.setLastName("Palizgar");
        teacher.setAge(32);
        
        System.out.println("First name: " + teacher.getFirstName());
        System.out.println("Last name: " + teacher.getLastName());
        System.out.println("Age: " + teacher.getAge());
    }
}
