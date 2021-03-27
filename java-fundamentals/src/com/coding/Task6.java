package com.coding;

import javax.swing.*;
import java.util.Scanner;


public class Task6 {
    /*
  Write a program that reads student scores, gets the best score, and then
  assigns grades based on the following scheme:

  Grade is A if score is >= best - 10
  Grade is B if score is >= best - 20
  Grade is C if score is >= best - 30
  Grade is D if score is >= best - 40
  Grade is F otherwise

  The program prompts the user to enter the total number of students, then
  prompts the user to enter all of the scores, and concludes by displaying
  the grades.
*/
    
    public static void main(String[] args) {
        int[] scores = initialize();
        int best = findBestScore(scores);
        displayGrades(scores, best);
    }
    
    private static int[] initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter " + numberOfStudents + " scores:");
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        return scores;
    }
    private static int findBestScore(int[] scores) {
        int best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > best){
                best = scores[i];
            }
        }
        return best;
    }
    private static void displayGrades(int[] scores, int best) {
        for (int i = 0; i < scores.length; i++) {
            char c;
            if(scores[i] >= best - 10){
                c = 'A';
            }else if(scores[i] >= best - 20){
                c = 'B';
            }else if(scores[i] >= best - 30){
                c = 'C';
            }else if(scores[i] >= best - 40){
                c = 'D';
            }else{
                c = 'F';
            }
            System.out.println("Student " + i + " score is: " + scores[i] + " and grade is: " + c);
        }
    }
    
}
