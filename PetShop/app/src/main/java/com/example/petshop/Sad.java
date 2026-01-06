package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad(Date date) {
        super(date);
    }
    public Sad(){
        this.date = new Date();
    }

    @Override
    public String feels(){
        return ":(";
    }
}
