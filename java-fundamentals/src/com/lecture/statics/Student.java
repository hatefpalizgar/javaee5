package com.lecture.statics;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    
    public static String facultyName = "Science Faculty";
    
    public static void whoAmI() {
        System.out.println("John Smith once said: \"im am good\" ");
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    private void mySecret() {
        //
    }
}
