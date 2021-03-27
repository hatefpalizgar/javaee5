package com.sda;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int divide(int x, int y) {
        if(y==0){
            return -1;
        }
        return x / y;
    }
}
