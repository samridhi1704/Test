package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {


    @Test
    void shouldReturnTrueIfNumberIsEven() {

        int number = 8;
        EvenOdd even = new EvenOdd();

        boolean isEven = even.isEvenOdd(number);

        assertTrue(isEven);
    }

    @Test
    void shouldReturnFalseIfNumberIsOdd() {

        int number =5;
        EvenOdd odd = new EvenOdd();

        boolean isOdd = odd.isEvenOdd(number);

        assertFalse(isOdd);

    }
}
