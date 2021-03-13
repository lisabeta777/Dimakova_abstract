package com.company;

public class MuggleWithGun extends Man implements Gun {

    public MuggleWithGun(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public String run() {
        return "улетел на вертолете";
    }
}
