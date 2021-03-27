package com.lecture.review;

public class Ex03 {
    
    /*
  Write a program that randomly generates an integer between 1 and 12 and
  displays the English month name January, February, ..., December for the
  number 1, 2, ..., 12, accordingly.
  hint: google: 'how to generate random integer in Java'
*/
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 12 /* 0.0-11.9999 */) /*0-11*/ + 1  /* 1-12*/;
        System.out.println("Random generated integer is: " + randomNumber);
        if(randomNumber < 1 || randomNumber > 12){
            System.out.println("Number out of range");
        }else{
            switch (randomNumber) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                //... do the rest at home
            }
        }
    }
}
