package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GFGTest {

    @Test
    void shouldPrintHeloWhenStringIsPassed(){

        GFG print = new GFG();
        String expectedValue = "Hello World";
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


    @Test
    void shouldReturnIndexOfTheKeyElementWhenArrayANdKeyISPassed() {

        GFG binarySearch = new GFG();
        int expectedValue = 3;
        int actualValue = binarySearch.binarySearch();
        assertEquals(expectedValue,actualValue);
    }


    @Test
    void shouldReturnZeroIfTheTwoArraysAreEqual() {

        GFG comparee = new GFG();
        int expectedValue =0;
        int actualValue = comparee.compareArray();
        assertEquals(expectedValue,actualValue);
    }


}
