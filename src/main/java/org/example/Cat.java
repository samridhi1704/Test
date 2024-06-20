package org.example;

import org.example.Behaviour.Eat;

public class Cat {

    private final Eat eat;

    public Cat() {
        this.eat = new Eat();
    }

    public String eat()
    {
        return eat.eat();
    }


}
