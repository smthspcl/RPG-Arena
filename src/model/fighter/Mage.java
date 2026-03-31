package model.fighter;

import model.interfaces.Healable;

public class Mage extends Fighter implements Healable {

    private int mana;

    public Mage(String name, int maxHealth, int attack, int defense, int mana) {
        super(name, maxHealth, attack, defense);
        this.mana = 100;
    }

    @Override
    public String getClassName() {
        return "Маг";
    }

    @Override
    public int specialAttack() {
        if(mana>=30) {
            mana-=30;
            System.out.println(getFighterName()+" кастует огненный шар!");
            return getAttack()*3;
        } else {
            System.out.println(getFighterName() + " бьёт посохом... мана закончилась");
            return getAttack();
        }
    }

    public void regenerateMana(int amount) {
        mana+=amount;
        if(mana>100){ mana = 100;}
    }

    @Override
    public void printInfo() {
        System.out.println("- имя: "+getFighterName()+"\n- класс: "+getClassName()+"\n- уровень: "+getLevel()+"\n- здоровье: "+getHealth()+"\n- атака: "+getAttack()+"\n- защита: "+getDefense()+"\n- мана: "+mana);
        System.out.println("---------------------");
    }

    @Override
    public void healSelf() {
        if(canHeal()) {
            mana -= 20;
            heal(30);
            System.out.println(getFighterName()+" использует магию лечения!");
        } else {
            System.out.println("Недостаточно маны для лечения...");
        }
    }

    @Override
    public boolean canHeal() {
        return mana>=20;
    }
}
