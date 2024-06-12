package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoNumbersTest {

    @Test
    void shouldReturnSumFiveIfTheNumbersAreThreeAndTwo() {

        int numberOne =3;
        int numberTwo =2;
        int expectedValue=5;

        SumOfTwoNumbers sum = new SumOfTwoNumbers();

        int actualValue = sum.sumOfTwoNumbers();

        assertEquals(expectedValue,actualValue);



    }


}
