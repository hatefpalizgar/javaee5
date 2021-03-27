package com.sda.scope;

public class ShadowDemo {
    
    private int x = 0; // instance variable
    private int y = 0;
    
    public void someMethod() {
        int x = 1;      // local variable
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
    public static void main(String[] args) {
        // local variable x is shadowing/hiding instance variable
        ShadowDemo shadowDemo = new ShadowDemo();
        shadowDemo.someMethod();
    }
}
