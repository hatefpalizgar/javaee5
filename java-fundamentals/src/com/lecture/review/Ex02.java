package com.lecture.review;

import java.util.Scanner;


public class Ex02 {
    /*
  Write a program that reads a Celsius degree in a double value from the
  console, then converts it to Fahrenheit and displays the result. The formula
  for the conversion is as follows:

  fahrenheit = (9 / 5) * celsius + 32
*/
    public static void main(String[] args) {
        // 1- get the user input
        Scanner input = new Scanner(System.in);
        // 2- store it in a double variable
        double celsius = input.nextDouble();
        // 3- write a method to convert Celsius to Farenheit
        double convertedCelsius = convertCelsiusToFarenheit(celsius);
        // 4- display the converted value using print
        System.out.println("Celsius degree: " + celsius + " and in Farenheit: " + convertedCelsius);
    }
    
    public static double convertCelsiusToFarenheit(double celsius) {
         // 9/5 is automatically converted to integer 1
        // to avoid automatic conversion to integer use floating point style numbers
        return (9.0/5)*celsius + 32;
    }
    
}
