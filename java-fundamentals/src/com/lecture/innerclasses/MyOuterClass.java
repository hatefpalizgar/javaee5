package com.lecture.innerclasses;

public class MyOuterClass {
    private int outerNumber = 5;
    public class MyInnerClass {
        public void printNumber() {
            // the inner class has access to all properties of the outer class
            // even the private members
            System.out.println(outerNumber);
        }
    }
    
    public static class StaticInnerClass {
        public void printNumber() {
           // System.out.println(outerNumber);  // static member has no access to instance member
        }
    }
    
    public MyInnerClass init() {
        // the outer class has access to create any instance of the inner class
        return new MyInnerClass();  // = this.new MyInnerClass()
    }
}