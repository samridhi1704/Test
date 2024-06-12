package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnOneTwentyFiveWhenTheValueIsFive() {

        int number = 5;
        int expectedValue = 120;
        Factorial factorial = new Factorial();

        int actualValue = factorial.calculate(number);


        assertEquals(expectedValue,actualValue);


    }


}
