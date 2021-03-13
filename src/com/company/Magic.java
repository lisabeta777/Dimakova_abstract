package com.company;

public interface Magic {

    public default String protectionSpell(){
        return "защитился заклинанием 'Протего'";
    }
    public default String attackSpell(){
        return "атаковал заклятием 'Авада Кедавра'";
    }

}
