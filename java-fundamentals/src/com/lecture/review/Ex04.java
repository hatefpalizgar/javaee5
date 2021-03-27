package com.lecture.review;

import java.util.Scanner;


public class Ex04 {
    /*
Average acceleration (a) is defined as the change of velocity (v1-v0) divided by the
time taken to make the change (t), as shown in the following formula:

                      a = (v1 - v0) / t

Write a program that prompts the user to enter the starting velocity v0
in meters/second, the ending velocity v1 in meters/second, and the time
span t in seconds, and displays the average acceleration.
*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, t");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double avg = averageCalculator(v0, v1, t);
        System.out.println("Average acceleration: " + avg);
    }
    
    private static double averageCalculator(double v0, double v1, double t) {
        return (v1 - v0) / t;
    }
}
