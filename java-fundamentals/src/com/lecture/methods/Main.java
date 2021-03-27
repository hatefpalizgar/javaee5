package com.lecture.methods;

public class Main {
    public static void main(String[] args) {
        // body of the main method
        double result = convertUSDToEuro(500);
        System.out.println(result);
        returnExample(40);
        System.out.println("Return keyword reached");
    }
    
    public static double convertUSDToEuro(double usd) {
        double euroAmount = 0;
        euroAmount = usd * 0.9;
        return euroAmount;
    }
    
    public static void returnExample(int number) {
        if(number % 2 == 0){
            return; // interrupt the code execution
        }
        System.out.println(number);
    }
}
