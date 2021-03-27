package com.lecture.mutability;

public class MutableClass {
    // having public field is a sign of mutability
    public String name;
    
    public String getName() {
        return name;
    }
    
    // having setter method is another sign of mutability
    public void setName(String name) {
        this.name = name;
    }
}
