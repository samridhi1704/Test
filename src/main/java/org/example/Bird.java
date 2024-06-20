package org.example;

import org.example.Behaviour.Fly;

public class Bird  {

    private final Fly fly;

    public Bird() {
        this.fly = new Fly();
    }

    public String fly(){
        return fly.fly();
    }

}
