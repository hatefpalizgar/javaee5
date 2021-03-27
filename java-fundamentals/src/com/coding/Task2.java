package com.coding;


/*
  Write the methods with the following headers

  public static int reverse(int number)
  public static boolean isPalindrome(int number)

  Use the reverse method to implement isPalindrome. A number is a palindrome
  if its reversal is the same as itself. Write a test program that prompts the
  user to enter an integer and reports whether the integer is a palindrome.
*/

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int entry = scanner.nextInt();
    System.out.println(entry + " is palindrome: " + isPalindrome(entry));
    }
    
    public static int reverse(int number){
        StringBuilder stringBuilder = new StringBuilder(number + "");
        return Integer.parseInt(stringBuilder.reverse().toString());
    }
    
    public static boolean isPalindrome(int number){
        int reversedNumber = reverse(number);
        return reversedNumber == number;
    }
    
}

