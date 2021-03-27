package com.lecture.arrays;

public class Main {
    public static void main(String[] args) {
//        // primitives declaration + initialization
//        int number = 10;
//
//        // syntax for declaring an array
//        String[] myArray = new String[10];
//        System.out.println(myArray[0]);  // returns null
//         declare and initialize the array
//        String[] mySecondArray = new String[]{"Hi","Welcome","Jack","Estonia"};
//        System.out.println(mySecondArray[3]);
//
//        System.out.println("Size of mySecondArray is: " + mySecondArray.length);
//        System.out.println("The index of the last element in mySecondArray is: " + (mySecondArray.length - 1));
//        System.out.println(mySecondArray[4]);
//
//        int[] numbers = new int[2];
//        System.out.println(numbers[0]);  // returns 0
//
//        boolean[] booleans = new boolean[5];
//        System.out.println(booleans[0]); // returns false
//
//        char[] chars = new char[2];
//        System.out.println(chars[0]);  // returns 0
//
//        int tabLength = 4;
//        String[] names = new String[tabLength];
//        names[0] = "Jan";
//        names[3] = "roman";
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Element index " + (i+1)  + ": " + names[i]);
//        }
//
//        System.out.println(names.length);
//        String[][] myArray = new String[3][];
//        myArray[0] = new String[]{"Alice", "has", "the", "cat"}; // creating the first row (index number 0)
//        myArray[1] = new String[]{"The", "cat", "has", "Alice"};  // creating the second row (index number 1)
//        myArray[2] = new String[]{"The", "car", "has", "Police"};  // creating the third row (index number 2)
//
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                System.out.print(myArray[i][j] + " "); // [i=1][j=0] [i=1][j=1] [i=1][j=2]
//            }
//            System.out.println();
//        }
//        System.out.println(myArray.length);  // number of table rows
//        System.out.println(myArray[0].length); // number of table columns
        // exercise: create a multiplication table for numbers 1 to 3
        // 1=1x1 2=1x2 3=1x3
        // 2=2x1 4=2x2 6=2x3
        // 3=3x1 6=3x2 9=3x3
        int[][] table = new int[8][8];
        for (int row = 0; row < table.length; row++) {
            // outer for loop responsible for iteration over each row
            for (int column = 0; column < table[0].length; column++) {
                // inner for loop responsible for iteration over each column
                System.out.print((row + 1) * (column + 1) + "\t");
            }
            System.out.println();
        }
    }
}
