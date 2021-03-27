package com.coding;

import java.util.Scanner;


public class Task7 {
    /*
  Write a program that prompts the user to enter the number of students, the
  students' names, and their scores, and prints the student names in
  decreasing order of their scores.
*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter student name: ");
            names[i] = input.next();
            System.out.println("Enter score: ");
            scores[i] = input.nextInt();
        }
        
        sortDecreasing(names, scores);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    } // end of Main method
    
    
    public static void sortDecreasing( String[] names, int[] scores) {
        boolean flag = true;
        while (flag) {
            flag=false;
            for (int i = 0; i < scores.length - 1; i++) {
                if(scores[i] < scores[i + 1]){
                    flag= true;
                    int temp = scores[i + 1];
                    scores[i + 1] = scores[i];
                    scores[i] = temp;
    
                    String tempString = names[i + 1];
                    names[i + 1] = names[i];
                    names[i] = tempString;
                }
            }
        }
    }
   
}
