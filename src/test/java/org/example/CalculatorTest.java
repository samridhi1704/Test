package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldReturnFiveWhenTwoAndThreeIsPassed() {

        Calculator cal = new Calculator();
        cal.add(2 ,3);
        int result = cal.getResult();

        assertEquals(5,result);
    }
}