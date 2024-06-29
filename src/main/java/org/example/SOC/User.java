package org.example.SOC;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

