package com.lecture.review;

public class ConstructorQuiz {
    
    private int number;
    private double real;
    private boolean condition;
    private String name;
    private Circle circle;
    
    public ConstructorQuiz(int num, String title) {
        number = num;
        name = title;
    }
    
    public static void main(String[] args) {
        ConstructorQuiz q = new ConstructorQuiz(5, "Mike");
        System.out.println(q.number);
        System.out.println(q.real);
        System.out.println(q.condition);
        System.out.println(q.name);
        System.out.println(q.circle);
    }
    
    public class Circle {
    
    }
}
