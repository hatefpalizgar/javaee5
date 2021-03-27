package com.lecture.mutability;

public class Main {
    public static void main(String[] args) {
        // mutation: change
        // mutable: being able to change
        // immutable: unable to change
        
        MutableClass mutableObject = new MutableClass();
        // I can change the state/properties/fields of a mutable object
        mutableObject.name = "Jack";
        mutableObject.setName("Daniel");
        
        
        ImmutableClass immutableObject = new ImmutableClass("Mark");
        // I can no longer change any state/field/property of the immutable object
        // once initialized
        
    }
}
