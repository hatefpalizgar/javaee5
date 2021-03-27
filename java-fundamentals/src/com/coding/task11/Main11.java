package com.coding.task11;

public class Main11 {
    /*
  The String class is provided in the Java library. Provide your own
  implementation for the following methods (name the new class MyString1):

  public MyString1(char[] chars);
  public char charAt(int index);
  public int length();
  public MyString1 substring(int begin, int end);
  public MyString1 toLowerCase();
  public boolean equals(MyString1 s);
  public static MyString1 valueOf(int i);
*/
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1(new char[]{'H', 'A', 'P', 'P', 'Y'});
//        System.out.println(myString1.charAt(2));
        System.out.println(myString1.substring(0,3));
    }
}
