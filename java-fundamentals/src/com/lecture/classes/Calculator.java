package com.lecture.classes;
// exercise:
// create a Calculator class with add(arg1,arg2) , multiply(arg1,arg2)
// and divide(arg1,arg2) methods
// and with 2 fields called arg1 and arg2 : both are int
// instantiate a calculator object inside Main class main()
// try to give some values to calculator object and test if your code works fine
// try to test for edge cases like divide by zero

public class Calculator {
    // fields, states
    private double numberA;
    private double numberB;
    
    public double divide() {
        // validation logic
        if(numberB != 0){
            return numberA / numberB;
        }
        return 0;
    }
    public Calculator(int arg1, int arg2) {
        numberA = arg1;
        numberB = arg2;
    }
    
    // getter method
    public double getNumberA(){
        return numberA;
    }
    
    // getter method
    public double getNumberB(){
        return numberB;
    }
    
    // setter method
    public void setNumberA(double newValue){
        if(newValue>0){
            numberA = newValue;
        }
    }
    
    // setter method
    public void setNumberB(double newValue) {
        numberB = newValue;
    }
    
}
