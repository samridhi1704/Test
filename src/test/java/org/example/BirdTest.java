package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {


    @Test
    void birdShouldFlyWhenFlyingIsPassed() {

        Bird bd = new Bird();
        assertEquals("Can Fly" , bd.fly());
    }


}
