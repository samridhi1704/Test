package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTest {

    @Test
    public void shouldReturnEight()
    {

        int expectedValue =8;

        Max max = new Max();

        int actualValue = max.maximum();

        assertEquals(expectedValue , actualValue);

    }











}
