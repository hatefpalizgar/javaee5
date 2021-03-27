package com.lecture.ifconditions;

public class Exercise {
    public static void main(String[] args) {
        // define a variable called points
        // if the points are 100 then print 'passed' otherwise print 'failed'
        int points = 80;
        if(points == 100){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        
        
        // define a variable called age
        // check if 35 is a teenager or not
        // if it was a teenager, print 'I am a teenager'
        // otherwise print 'I'm fully grown'
        
        int age = 30;
        if(age < 20){
            System.out.println("I'm a teenager");
        }else{
            System.out.println("I'm fully grown");
        }
        
        
        // we have a character like 'w' which points to the direction
        // print to the console the direction that a user is going depending on the character receive
        // if direction is 'w' -> west
        // 'e' -> east
        // 'N' -> North and 'S' -> South
        
        char direction = 'w';
        switch(direction){
            case 'w':
                System.out.println("You are going to WEST");
               break;
            case 'e':
                System.out.println("You are goint to EAST");
                break;
            case 'n':
                System.out.println("You are going NORTH");
                break;
            case 's':
                System.out.println("You are going SOUTH");
                break;
            default:
                System.out.println("You are going the wrong direction");
        }
        
    }
}
