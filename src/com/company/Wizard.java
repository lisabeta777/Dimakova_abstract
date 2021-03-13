package com.company;

public class Wizard extends Man implements Magic{

    public Wizard(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public String run() {
        return "сбежал в волшебный лес";
    }
}
