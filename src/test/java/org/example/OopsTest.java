package org.example;

import org.example.exception.Oops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopsTest {
    @Test
    void shouldGiveTheIdOfTheUserWhenIdIsCalled() {

        Oops classss = new Oops(10,3);
        int expectedValue = 3;
        int actualValue = classss.classessss();
        assertEquals(expectedValue,actualValue);
    }
}
