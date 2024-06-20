package org.example;

import org.example.Behaviour.Sing;
import org.example.Behaviour.Walk;

public class Animal {

    private final Walk walk;
    private final Sing sing;

    public Animal() {
        this.walk = new Walk();
        this.sing = new Sing();
    }

    public String walk(){
        return walk.walk();
    }

    public String sing(){
       return sing.sing();
    }
}
