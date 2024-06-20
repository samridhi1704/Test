package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    @Test
    void birdShouldSingWhenFlyingIsPassed() {

        Bird bd = new Bird();
        assertEquals("Can Sing" , bd.sing());
    }

    @Test
    void birdShouldWalkWhenFlyingIsPassed() {

        Bird bd = new Bird();
        assertEquals("Can Walk" , bd.walk());
    }

    @Test
    void birdShouldFlyWhenFlyingIsPassed() {

        Bird bd = new Bird();
        assertEquals("Can Fly" , bd.fly());
    }


}
