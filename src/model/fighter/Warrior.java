package model.fighter;

public class Warrior extends Fighter {

    public Warrior(String name, int maxHealth, int attack, int defense) {
        super(name, maxHealth, attack, defense);
    }

    @Override
    String getClassName() {
        return "Воин";
    }

    @Override
    int specialAttack() {
        System.out.println(getFighterName()+" наносит мощный удар!");
        return getAttack()*2;
    }
}
