package com.lecture.review;

import java.util.Scanner;


/*
 * Given a positive integer *num*, write a function which returns True if *num* is a perfect square else False.
 **Note:** **Do not use any built-in library function such as**   `sqrt`.
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int num = scanner.nextInt();
      
        for (int i = 1; i <= num; i++) {
            // in each iteration of the loop I want to check
            // if there is any number that meets this condition => num/i=i and num%i = 0
            if(num / i == i && num % i == 0){
                result =true;
            }
        }
        System.out.println(result);
        
    }
}
