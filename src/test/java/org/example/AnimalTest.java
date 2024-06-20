package org.example;

import org.example.Behaviour.Sing;
import org.example.Behaviour.Walk;
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

    @Test
    void shouldAnimalBeAbleToSingkWhenItIsPassed() {

        Animal an = new Animal();
        String expectedValue = "Can Sing";
        String actualValue = an.sing();
        assertEquals(expectedValue,actualValue);
    }
}
