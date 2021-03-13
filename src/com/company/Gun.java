package com.company;

public interface Gun {

    public default String dodgeTheSpell(){
        return "увернулся от заклятия";
    };
    public default String shootAGun(){
        return "выстрелил из базуки";
    };

}
