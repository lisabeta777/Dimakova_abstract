package com.company;

public class Battle {

    Wizard Garry = new Wizard("Гарри Поттер", "Волшебник");
    MuggleWithGun Petr = new MuggleWithGun("Петя", "Маггл с базукой");

        public void start() {

            System.out.println(Garry.specialization + " " + Garry.name + " " + Garry.attackSpell());
            System.out.println(Petr.specialization + " " + Petr.name + " " + Petr.dodgeTheSpell());
            System.out.println(Petr.specialization + " " + Petr.name + " " + Petr.shootAGun());
            System.out.println(Garry.specialization + " " + Garry.name + " " + Garry.protectionSpell());
            System.out.println(Petr.specialization + " " + Petr.name + " " + Petr.shootAGun());
            System.out.println(Garry.specialization + " " + Garry.name + " " + Garry.run());

        }
}
