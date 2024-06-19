package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeTest {


    @Test
    void shouldReturnTrueWhenThirteenIsPassed()
    {

        int number = 13;
        boolean expectedValue = true;

        Prime prime = new Prime();

        boolean actualValue = prime.primee(13);
        assertEquals(expectedValue , actualValue);
    }


}
