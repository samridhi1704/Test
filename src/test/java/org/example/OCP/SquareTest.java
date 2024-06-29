package org.example.OCP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {



    @Test
    void shouldReturnAreaOfSquare() {
        Square s1 = new Square();
        assertEquals(12.56,s1.area(2,2));

    }
}