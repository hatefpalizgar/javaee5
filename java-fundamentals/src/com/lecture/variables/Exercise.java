package com.lecture.variables;

public class Exercise {
    public static void main(String[] args) {
        // write an application that prints whatever to the user
        // and then print out the result of division of two numbers
        // don't forget to use variables
        
        long firstNumber = 2147483647;
        long secondNumber = 15;
        long result = firstNumber / secondNumber;
    
        System.out.println("Hello Hatef, This is the result of dividing 45 by 15: " + result);
        
        
        // if it was javascript -> var number = 5; var number = "some text";
        
        boolean isDog = false;
        System.out.println(isDog);
    
        String signValue = "y";
        char tab = '\t';
        System.out.println(tab + signValue + "\n" + "after pressing enter");
        
        char a = 'a';
        System.out.println(a+0);
        
        
        int someNumbers = 5;
      //  someNumbers+=4;  // someNumbers = someNumbers + 4
      //  someNumbers-=2;  // someNumbers = someNumbers - 2;
        someNumbers*=7;
        
        System.out.println(someNumbers);
    
        int someVariable = 5;
        System.out.println(someVariable++);  // the addition doesn't happen on the same line, but on the next line
        System.out.println(someVariable);
        
        
        int someOtherVariable = 13;
        System.out.println(++someOtherVariable); // the addition happens on the same line
        
        int aa = 1;
        int bb = 3;
        boolean result2 = (aa != bb);
        System.out.println(result2); // tell if aa is equal to bb
    
    
        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.println(!(boolValue1 && boolValue2));     // true will be printed
        
        boolean isHuman = true;
        System.out.println(!isHuman);   // false will be printed
    
    
        double n = 99.9989;   // double size > int size
        int m = (int) n;
        System.out.println(m);  // the value 99 will be displayed
    
    
        double nn = 99.9989;
       // int mm = nn;          // error!
    
    }
}
