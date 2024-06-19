package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoNumbersTest {

    @Test
    void shouldReturnSumFiveIfTheNumbersAreThreeAndTwo() {


        int expectedValue=5;

        SumOfTwoNumbers sum = new SumOfTwoNumbers();

        int actualValue = sum.sumOfTwoNumbers(3,2);

        assertEquals(expectedValue,actualValue);



    }


}
