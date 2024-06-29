package org.example.Behaviour;

import org.example.MarkableInterfaceExample;

public class MarkableInterface  implements MarkableInterfaceExample {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MarkableInterface{" +
                "name='" + name + '\'' +
                '}';
    }



}
