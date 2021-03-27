package com.lecture.objects;

public class Person {
    private String firstName;
    protected String lastName; // protected access modifier
    int age; // default access modifier : accessed directly from within the same package
    // not the other packages
    
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
