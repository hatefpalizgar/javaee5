package com.coding;
/*
  Write a method that returns a new array by eliminating the duplicate values
  in the array using the following method header:

  public static int[] eliminateDuplicates(int[] list)

  Write a test program that reads in ten integers, invokes the method, and
  displays the result.
*/

import java.util.Arrays;


public class Task5 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 4, 3};
        int[] myNewArr = eliminateDuplicates(myArr);
        for (int n : myNewArr) {
            System.out.print(n + " ");
        }
    }
    
    // Read more about Flowcharts and Pseudocode
    public static int[] eliminateDuplicates(int[] list) {
        int[] uniques = new int[list.length];
        int currentIndex = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j <= currentIndex; j++) {
                if(list[i] == uniques[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){ // if uniques[] does NOT contain element i of list[]
                // add it to uniques[]
                uniques[currentIndex] = list[i];
                currentIndex++;
            }
        }
        return Arrays.copyOf(uniques, currentIndex);
    }
}
