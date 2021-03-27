package com.coding;

import java.util.Scanner;


public class Task1 {
    /*
  Write a method that computes the sum of the digits in an integer. Use the
  following header:

  public static int sumDigits(long n)

  For example, sumDigits(234) returns 9 (2 + 3 + 4). Write a test program that
  prompts the user to enter an integer and displays the sum of all its digits.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long entry = scanner.nextLong();
        System.out.println(sumDigits(entry));
    }
    
    public static int sumDigits(long n) {
        // n = 1234
        // 4 -> 1234 % 10
        // 3 -> n / 10 -> 123 -> 123 % 10
        // 2 -> n / 10 -> 12 -> 12 % 10
        // 1 -> n / 10 -> 1 -> 1 % 10
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
