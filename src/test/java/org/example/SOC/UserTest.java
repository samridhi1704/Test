package org.example.SOC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldReturnNameAndEmail() {

        User helo = new User("Sam" , "SAm@email.com" ,1);
        assertEquals("Sam" , helo.getName());
        assertEquals("SAm@email.com" , helo.getEmail());
        assertEquals(1,helo.getId());


    }
}