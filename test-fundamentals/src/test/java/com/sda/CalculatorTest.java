package com.sda;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @BeforeEach
    public void start() {
        System.out.println("Test is gonna start...");
    }

    @Test
    @DisplayName("Add method works fine")
    public void testAdd() {
        // given
        int firstNumber = 2;
        int secondNumber = 3;
        boolean isMethod = false;
        // when
        int result = Calculator.add(firstNumber, secondNumber);

        assertTrue(isMethod,"isMethod should be True");

        //then
//        assert (result == 5);
        assertEquals(4, result, "add method should return 4");
    }

    @Test
    @Disabled
    public void testDivide() {
        //given
        int firstNumber = 8;
        int secondNumber = 4;
        //when
        int result = Calculator.divide(firstNumber, secondNumber);
        //then
        assert (result == 2);
    }

    @Test
    @DisplayName("Dividing by zero is not allowed")
    public void testDivideByZero() {
        //given
        int firstNumber = 8;
        int secondNumber = 0;
        //when
        int result = Calculator.divide(firstNumber, secondNumber);
        //then
        assert (result == -1);
    }

    @Test
    public void testArraysAreEqual(){
        int[] arrayA = {1,2,3};
        int[] arrayB = {1,2,3};
        assertArrayEquals(arrayA,arrayB);
    }

    @AfterAll
    public static void finish() {
        System.out.println("All tests are finished");
    }
}
