package com.lecture.mutability;

public class ImmutableClass {
    // having private field is a sign of immutability
    private String name;
    
    public String getName() {
        return name;
    }
    
    public ImmutableClass(String name) {
        // this keyword is a reference variable pointing to the same object we are currently in
        this.name = name;
    }
    
    // having no setter method is another sign of immutability
  
}
