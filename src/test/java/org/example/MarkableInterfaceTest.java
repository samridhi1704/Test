package org.example;

import org.example.Behaviour.MarkableInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkableInterfaceTest {

    @Test
    void shouldReturnName() {

        MarkableInterface test = new MarkableInterface();
        test.setName("Name");
        assertEquals("Name" , test.getName());


    }
}
