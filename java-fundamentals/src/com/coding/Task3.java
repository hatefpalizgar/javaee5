package com.coding;


/*
  Write a method with the following header to display three numbers in
  increasing order:

  public static void displaySortedNumbers(double num1, double num2, double num3)

  Write a test program that prompts the user to enter three numbers and invokes
  the method to display them in increasing order.
*/

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] numArr = {num1, num2, num3};
        //Solution 1: Arrays.sort(numArr);  // using sort method
        //Solution 2: using our own sorting algorithm -> myOwnSortMethod
        myOwnSortMethod(numArr);
        for (double number : numArr) {
            System.out.println(number);
        }
    }
    
    public static void myOwnSortMethod(double[] numbers) {
        boolean flag = true; // we define this flag only to keep track of whether a swap is happened or not
        while (flag) {
            flag=false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]){ // if swapping is needed
                    flag= true;
                    double temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}
