package com.lecture.classes;

public class Main {
    public static void main(String[] args) {
//        String firstName = new String("Hatef");
        
        // telling the constructor to build a real building out of the Building plan/class
        // Object is an implementation of class
        // create an object == instantiate an object
        // we are creating an instance of a Building
//        Building towerA = new Building();
//        System.out.println(towerA.area);
//        System.out.println(towerA.numberOfFloors);
        
        // towerB is another instance of Building
//        Building towerB = new Building();
//        towerB.area = 4000;
//        towerB.numberOfFloors = 3;
//        System.out.println(towerB.numberOfFloors);
        
        // every class in Java comes with an implicitly default constructor
//        Student teacher = new Student();
//        teacher.age = 35;
//        System.out.println(teacher.age);
    
        Calculator myCalculator = new Calculator(10,2);
        
        // call divide method on object myCalculator
        // OR
        // we are talking to myCalculator through its divide method
        System.out.println(myCalculator.divide());
        
        System.out.println(myCalculator.getNumberA());
        
        // here I need to change the values inside myCalculator object
        myCalculator.setNumberA(68);
        myCalculator.setNumberB(34);
        System.out.println(myCalculator.divide());
        
    }
}
