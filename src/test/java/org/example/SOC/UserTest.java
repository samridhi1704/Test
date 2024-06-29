package org.example.SOC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldReturnNameAndEmail() {

        User helo = new User("Sam" , "SAm@email.com");
        assertEquals("Sam" , helo.name);
        assertEquals("SAm@email.com" , helo.email);


    }
}