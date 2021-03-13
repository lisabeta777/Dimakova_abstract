package com.company;

public interface Gun {

    default String dodgeTheSpell(){
        return "увернулся от заклятия";
    };
    default String shootAGun(){
        return "выстрелил из базуки";
    };

}
