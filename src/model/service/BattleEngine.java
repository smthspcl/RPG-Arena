package model.service;

import model.fighter.Fighter;

public class BattleEngine {


    public static void fight(Fighter a, Fighter b) {
        int aIni = a.getInitiative();
        int bIni = b.getInitiative();
        if(aIni>bIni) {
            if(aIni == 20) {
                b.takeDamage(a.specialAttack());
                return;
            }
            System.out.println(a.getFighterName()+" атакует!");
            b.takeDamage(a.getAttack());
        } else if (aIni==bIni) {
            System.out.println("Бойцы обменялись атаками!");
            b.takeDamage(a.getAttack());
            a.takeDamage(b.getAttack());
        }
        else {
            if(bIni == 20) {
                a.takeDamage(b.specialAttack());
                return;
            }
            System.out.println(b.getFighterName()+" атакует!");
            a.takeDamage(b.getAttack());
        }

    }
    public static void fullBattle(Fighter a, Fighter b) {
        System.out.println("| Битва началась!"+"\n| Боец "+a.getClassName()+": "+a.getFighterName());
        System.out.println("| VS");
        System.out.println("| Боец "+b.getClassName()+": "+b.getFighterName());

        int count = 1;

        while(a.isAlive() && b.isAlive()) {
            System.out.println("Раунд: "+count);
            fight(a,b);
            System.out.println("Здоровье "+a.getFighterName()+": "+a.getHealth());
            System.out.println("Здоровье "+b.getFighterName()+": "+b.getHealth());
            count++;
        }

    }
}
