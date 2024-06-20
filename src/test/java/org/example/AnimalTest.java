package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void shouldAnimalBeAbleToWalkWhenItIsPassed() {

        Animal an = new Animal();
       String expectedValue = "Can Walk";
       String actualValue = an.walk();
       assertEquals(expectedValue,actualValue);
    }
}
