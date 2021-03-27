package com.lecture.ifconditions;

public class Main {
    public static void main(String[] args) {
        // your code goes inside the main method/function
    
        float temperature = 36.95f;
        if (temperature >= 37.0f) {
            System.out.print("You have a fever!");
        } else if (temperature >= 36.6f && temperature < 36.8f) {
            System.out.print("You are healthy!");
        }else if (temperature > 36.9){
            System.out.println("The second else-if condition");
        }else {
            System.out.print("You are weakened!");
        }
        
        
        // switch statement
        int age = 32;
        switch (age) {
            case 10:        //false
                System.out.printf("I'm 10 years old");
                break;
            case 14:        //false
                System.out.println("I'm 14 years old");
                break;
            case 20:        //false
                System.out.println("I'm 20 years old");
                break;
            default:        // true
                System.out.println("I'm not 10,14,20.");
        }
    
        int age2 = 14;
        switch (age2) {
            case 10:        //false
                System.out.printf("I'm 10 years old");
                break;
            case 14:        //false
                System.out.println("I'm 14 years old");
               break;
            case 20:        //false
                System.out.println("I'm 20 years old");
                break;
            default:        // true
                System.out.println("I'm not 10,14,20.");
        }
    }
    
}
