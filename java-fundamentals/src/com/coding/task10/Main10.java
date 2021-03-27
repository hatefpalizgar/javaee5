package com.coding.task10;

public class Main10 {
    /*
  Design a class named Stopwatch. The class contains:

  - Private data fields startTime and endTime with getter methods.
  - A no-arg constructor that initializes startTime with the current time.
  - A method named start() that resets the startTime to the current time.
  - A method named stop() that sets the endTime to the current time.
  - A method named getElapsedTime() that returns the elapsed time for the
    stopwatch in milliseconds.

  Write a test program that measures the execution time of sorting 100,000
  numbers using [selection sort].
*/
    
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        double[] nums = generateRandomNumArrays();
        sw.start();
        selectionSort(nums);
        sw.stop();
        showResult(sw);
    }
    
    private static double[] generateRandomNumArrays() {
        double[] nums = new double[100_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100_000; // random number in range [0,100_000)
        }
        return nums;
    }
    
    private static void selectionSort(double[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            double largest = nums[0];
            int index = 0;
            for (int j = 0; j <= i; j++) {
                if(nums[j] > largest){
                    largest = nums[j];
                    index = j;
                }
            }
            double temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
    
    private static void showResult(Stopwatch sw) {
        System.out.println("Execution is done in: " + sw.getElapsedTime() + "ms");
    }
}
