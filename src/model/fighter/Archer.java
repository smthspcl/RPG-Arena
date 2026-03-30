package model.fighter;

public class Archer extends Fighter {

    private int arrows;
    public Archer(String name, int maxHealth, int attack, int defense, int arrows) {
        super(name, maxHealth, attack, defense);
        this.arrows = 15;
    }

    @Override
    String getClassName() {
        return "Лучник";
    }

    @Override
    int specialAttack() {
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
}
