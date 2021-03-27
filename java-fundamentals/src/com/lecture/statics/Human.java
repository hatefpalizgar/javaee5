package com.lecture.statics;

public class Human {
    public static boolean canDoSex=true;
    public String name;
    
    public void smile() {  // belongs to any instance/object created from Human class
        System.out.println(name);
        System.out.println(canDoSex); // canDoSex is static, so we can access it from non-static context
    }
    
    public static void eat() { // is shared/common between all instances/objects created from Human class.
        // it belongs to the Human class not any instances of Human
        // some code
        System.out.println("Yum Yum");
//        System.out.println(name);    name is non-static, so we can't access it from static context
    }
}
