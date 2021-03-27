package com.lecture.review;

public class Ex01 {
    /*
  Write a program that displays the area and perimeter of a rectangle with the
  width of 4.5 and height of 7.9 using the following formula:

  area = width * height
*/
    public static void main(String[] args) {
        System.out.println("area: " + getArea(4.5,7.9));
        System.out.println("perimeter: " + getPerimeter(4.5,7.9));
    }
    
    private static double getArea(double width, double height) {
        return width * height;
    }
    
    private static double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }
}
