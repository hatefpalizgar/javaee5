package com.lecture.innerclasses;

public class Main {
    public static void main(String[] args) {
        
        MyOuterClass externalClass = new MyOuterClass();
        // the way we should instantiate an inner class using the outerclass
        // it is not a good practice to instantiate an inner class from outside world
        // BUT it is possible in Java
        MyOuterClass.MyInnerClass internalClass = externalClass.new MyInnerClass();
        
        // how we should instantiate a static inner class
        MyOuterClass.StaticInnerClass staticInnerClass = new MyOuterClass.StaticInnerClass();
    }
}
