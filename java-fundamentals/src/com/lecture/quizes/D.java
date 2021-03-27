package com.lecture.quizes;

public class D {
    public static void main(String[] args) {
        // how we can call a non-static method from within the static context
        D object = new D();
        object.nonStaticMethod();
    }
    
    public void nonStaticMethod() {
        // some code ...
    }
}
