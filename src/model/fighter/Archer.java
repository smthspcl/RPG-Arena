package model.fighter;

import model.interfaces.Healable;
import model.interfaces.Stunnable;

public class Archer extends Fighter implements Healable, Stunnable {

    private boolean stunned;

    private int arrows;
    public Archer(String name, int maxHealth, int attack, int defense, int arrows) {
        super(name, maxHealth, attack, defense);
        this.arrows = 15;
    }

    @Override
    public String getClassName() {
        return "Лучник";
    }

    @Override
    public int specialAttack() {
        if(arrows>0){
            arrows--;
            System.out.println(getFighterName()+" выпускает точный выстрел! Стрел осталось: "+arrows);
            return getAttack()+15;
        } else {
            System.out.println(getFighterName()+" бьёт луком... стрелы кончились");
            return getAttack()/2;
        }
    }

    public void refillArrows(int amount) {
        if(arrows == 20) {
            System.out.println("Колчан полон стрел");
        } else {
            arrows = 20;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("- имя: "+getFighterName()+"\n- класс: "+getClassName()+"\n- уровень: "+getLevel()+"\n- здоровье: "+getHealth()+"\n- атака: "+getAttack()+"\n- защита: "+getDefense()+"\n- стрелы: "+arrows);
        System.out.println("---------------------");
    }

    @Override
    public void healSelf() {
        if(canHeal()){
            arrows-= 1;
            heal(20);
            System.out.println(getFighterName()+" использовал стрелу лечения!");
        } else {
            System.out.println("Стрелы закончились, невозможно использовать стрелу лечения...");
        }
    }

    @Override
    public boolean canHeal() {
        return arrows>=1;
    }

    @Override
    public void stun() {
        stunned = true;
        System.out.println(getFighterName()+" оглушён!");
    }

    @Override
    public boolean isStunned() {
        return stunned;
    }

    @Override
    public void recoverFromStun() {
        stunned = false;
    }

}
