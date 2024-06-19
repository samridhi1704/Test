package org.example.exception;

import org.example.GFG;

public class Oops {

    private final int rollNo;
    private final int id;

    public Oops(int rollNo, int id) {

        this.rollNo = rollNo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int classessss() {
        Oops obj = new Oops(rollNo, id);
        return obj.getId();

    }
}
