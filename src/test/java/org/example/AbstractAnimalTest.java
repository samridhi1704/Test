package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractAnimalTest {

    @Test
    void shouldReturnWoof() {

        AnimalAbstract dogl = new AbstractAnimalDog();
        assertEquals("Woof" , dogl.sound());

    }
}
