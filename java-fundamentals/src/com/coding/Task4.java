package com.coding;
/*
  Provide the body of isPrime(int number) method
  for testing whether a number is prime. Use this method to find the number of
  prime numbers less than 10000.
  A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
    For example, 5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself
    8 is not prime. because we can write 8 as 2*4 or 2*2*2 or 1*8
    a number is Prime only if it has 1 and itself as a divisor
*/

public class Task4 {
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 2; i < 10_000; i++) {
            if(isPrime(i)){
                primeCount++;
            }
        }
        System.out.println("There are " + primeCount + " prime numbers " +
                "less than 10,000");
    }
    
    public static boolean isPrime(int number) {
        // we should divide number by all numbers starting from 2 until number
        for (int i = 2; i < number / 2; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
