package com.sda;

/*Create one person object and test  getFirstName and getLastName methods*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    Person person=new Person("Hatef","Palizgar");

    @Test
    public void testGetFirstNameReturnsFirstName(){
        assertEquals("Hatef",person.getFirstName());
    }

    @Test
    public void testGetLastNameReturnsLastName(){
        assertEquals("Palizgar",person.getLastName());
    }
}
