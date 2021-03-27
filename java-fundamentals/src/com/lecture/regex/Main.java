package com.lecture.regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
//        boolean result;
//        result = Pattern.matches(".s", "ns");
//        System.out.println(result);
//
//        result = Pattern.matches("..t", "odt");
//        System.out.println(result);

//        Pattern p = Pattern.compile("a*b");
//        Matcher m = p.matcher("aaaaab");
//        result = m.matches();  // checks if a pattern complies with a specific REGEX
//        System.out.println(result);
        
        
        // Exercise: write a program that takes the user input (its a single word) and store it in a String variable with name 'input'
        // Check if the input has any alphabet letter in it
        // print out the result
        
        // 1- Scanner
        // 2- nextLine()
        // 3- define your Pattern
        // 4- define your matcher
        // 5- compare the matcher against the REGEX pattern
        // 6- display the result
        
        // Time: 15 mins
        
        boolean result;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // get the user input here
        
        Pattern pattern = Pattern.compile("[a-zA-Z]*"); // any alphabet (don't mind upper or lower case) and for any number of times
        Matcher matcher = pattern.matcher(input);
        result = matcher.matches();
        System.out.println(result);
    
    }
}
