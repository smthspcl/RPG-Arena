package model.fighter;

public class Mage extends Fighter {

    private int mana;

    public Mage(String name, int maxHealth, int attack, int defense, int mana) {
        super(name, maxHealth, attack, defense);
        this.mana = 100;
    }

    @Override
    String getClassName() {
        return "Маг";
    }

    @Override
    int specialAttack() {
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
}
