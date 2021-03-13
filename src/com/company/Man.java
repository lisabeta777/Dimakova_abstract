package com.company;

public abstract class Man {
    String name;
    String specialization;

    public Man(String name, String specialization){
        this.name=name;
        this.specialization=specialization;
    }

    public abstract String run();
    public String death(){
        return "убит";
    }
}
