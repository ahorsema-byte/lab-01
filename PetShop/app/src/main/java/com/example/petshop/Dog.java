package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {
    public Dog(String name){
        super(name);
        this.birthDate = new Date();
    }

    public Dog(String name, Date birthDate){
        super(name,birthDate);
    }

    @Override
    public String speak(){
        return "bark";
    }

    public Void pet() {
        return null;
    }
}
