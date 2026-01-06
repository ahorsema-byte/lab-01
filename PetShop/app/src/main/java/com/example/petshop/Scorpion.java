package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String name) {
        super(name);
        this.birthDate = new Date();
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    public String speak() {
        return "hiss";
    }
}
