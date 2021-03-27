package com.sda;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertJTest {

    @Test
    public void junitAssertions(){
        String actual = "I Love Estonia";

        assertEquals("I Love Estonia", actual);
    }

    @Test
    public void assertjAssertions(){
        String actual = "I Love Estonia";
        String myText = "A light bulb";
        // Fluent
        assertThat(actual).isEqualTo("I Love Estonia");

        /*Write a test that would pass only if a sample String starts with a, ends with b and contains space*/
        assertThat(myText.toLowerCase())
                .startsWith("a")
                .endsWith("b")
                .contains(" ");
    }

    /*Write a test that would check if your birthday is before today. birthday is of Date format*/

}
