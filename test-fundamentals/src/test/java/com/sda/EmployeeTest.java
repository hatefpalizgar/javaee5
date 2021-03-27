package com.sda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    // T.D.D -> Test Driven Development
    // First write your tests, then write the source code so that the test passes
    // RED
    // GREEN
    // REFACTOR

    @Test
    public void testIfEmployeeGetSalaryIsCalled_ReturnsSalary(){
        //given
        Employee employee = new Employee("Hatef","Palizgar",1400);
        double expectedSalary = 1400;

        //when
        double actualSalary = employee.getSalary();

        //then
        assertEquals(expectedSalary, actualSalary);
    }

    @Test
    public void testIfEmployeeGetFirstNameIsCalled_ReturnFirstName(){
        //given
        Employee employee = new Employee("Hatef","Palizgar",1400);
        String expectedFName="Hatef";

        //when
        String actualFN = employee.getFirstName();

        //then
        assertEquals(expectedFName,actualFN);
    }
}
