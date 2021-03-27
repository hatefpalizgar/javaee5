package com.lecture.quizes;

public class C {
    
    public static void main(String[] args) {
        // we can not run/call non-static/instance methods from within a
        // static context/method
       // method1();
        method2();
    }
    
    public void method1() {
        method2();
    }
    
    public static void method2() {
       //
    }
}
