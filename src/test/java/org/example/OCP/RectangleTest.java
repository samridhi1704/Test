package org.example.OCP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RectangleTest {

    @Test
    void shouldReturnArea() {

        Rectangle rec = new Rectangle();
        assertEquals(20,rec.area(4,5));
    }



}