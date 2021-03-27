package com.lecture.varargs;

public class Main {
    public static void main(String[] args) {
        print("Hatef","Palizgar");
        varPrint("Hatef", "Palizgar", "Tallinn");
        varPrint("Hatef", "Palizgar", "Tallinn","Estonia");
        arrayPrint(new String[]{"Hatef", "Palizgar", "Tallinn","Estonia"});
        
    }
    
    public static void print(String firstName, String lastName) {
        System.out.println(firstName + lastName);
    }
    
    
    public static void varPrint(String... text){
        System.out.println(text);
    }
    
    public static void arrayPrint(String[] text){
        System.out.println(text);
    }
}
