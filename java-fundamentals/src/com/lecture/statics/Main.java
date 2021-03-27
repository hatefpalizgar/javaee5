package com.lecture.statics;

public class Main {
    // method signature
    public static void main(String[] args) {
        Student tom = new Student();
        Student mike = new Student();
        Student alen = new Student();
        
        // static facultyName variable is shared across any instances made from Student
        System.out.println(tom.facultyName);
        tom.facultyName = "IT Department";
        System.out.println(mike.facultyName);
        System.out.println(alen.facultyName);
        // static fields / methods are called upon the class not the instance (object)
        System.out.println(Student.facultyName);
        // static method
        Student.whoAmI();
        
        
        // =============================
        Human children = new Human();  // children == object
        Human batman = new Human();
        
        // any instance of Human class can have their own specific name. it is not static so it is not shared.
        children.name = "Hatef";
        batman.name = "Argo";
        children.smile();
        batman.smile();
        children.eat();
        batman.eat();
      
    }
}
