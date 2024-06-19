package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GFGTest {

    @Test
    void shouldPrintHeloWhenStringIsPassed(){

        GFG print = new GFG();
        String expectedValue = "Hello";
        String actualValue = print.print();

        assertEquals(expectedValue , actualValue);

    }

    @Test
    void shouldReturnIntegerWhenIntIsPassed() {

        GFG autobox = new GFG();

        int expectedValue = 5;
        int actualValue = autobox.autoBoxing();

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void shouldReturnValueInIntWhenIntegerIsPassed() {

        GFG unbox = new GFG();
        int expectedValue = 5;
        int actualValue = unbox.unBoxing();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void shouldReturnTheListOfStringWhenStringArrayIsPassed() {

        GFG s = new GFG();
        String array[] = {"H","B"};
        String expectedArray[] = s.enhancedforLoop();
        assertTrue(Arrays.equals(array,expectedArray));

    }
}
