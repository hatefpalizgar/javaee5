package com.lecture.quizes;

public class Test {
    // what is the output?
    private static int i = 0;
    private static int j = 0;
    
    public static void main(String[] args) {
       // this i is local variable with scope limited to main method
        int i = 2;
        int k = 3;
        { // every pair of curly braces defines a new scope
            int j = 3;
            System.out.println("i + j is " + i + j);
            // "i + j is 2"
            // "i + j is 23"
        }
        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}

