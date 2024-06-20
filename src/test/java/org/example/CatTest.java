package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    void shouldInheritTheBehaviourOfParentClass() {

        Cat cc = new Cat();
        assertEquals("Can eat" , cc.eat());

    }


}
