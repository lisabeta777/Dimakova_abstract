package com.company;

public interface Magic {

    default String protectionSpell(){
        return "защитился заклинанием 'Протего'";
    }
    default String attackSpell(){
        return "атаковал заклятием 'Авада Кедавра'";
    }

}
