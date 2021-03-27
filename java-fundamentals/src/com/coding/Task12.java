package com.coding;

import java.util.Arrays;
import java.util.Scanner;


public class Task12 {
    /*
     * Write an application that will take a positive number from the user (type int)
     * and draw a wave with a given length and height of 4 lines,
     * according to the following example (fill empty spaces with spaces):
     *
     * */
    public static void main(String[] args) {
        System.out.println("Enter the length");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        printStars(input);
    }
    
    public static void printStars(int input) {
        String[][] matrix = new String[4][input];
        for (String[] row : matrix) {
            Arrays.fill(row, " ");
        }
        
        // print first row
        for (int j = 0; j < input; j = j + 6) {
            matrix[0][j] = "*";
        }
        // print middle rows
        for (int i = 1; i < 3; i++) {
            for (int j = i; j < input; j = j + 6) {
                matrix[i][j] = "*";
            }
            for (int j = 6-i; j < input; j = j + 6 ) {
                matrix[i][j] = "*";
            }
        }
        
        // print last row
        for (int j = 3; j < input; j = j + 6) {
            matrix[3][j] = "*";
        }
        
        // print whole wave
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
