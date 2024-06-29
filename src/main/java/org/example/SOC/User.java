package org.example.SOC;

public class User {

    private String name;
    private String email;
    private int id;

    public User(String name, String email , int id) {
        this.name = name;
        this.email = email;
        this.id=1;

    }
    // flunent Interface
    public User setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }




}

