package model.fighter;

import model.interfaces.Stunnable;

public class Warrior extends Fighter implements Stunnable {

    private boolean stunned;

    public Warrior(String name, int maxHealth, int attack, int defense) {
        super(name, maxHealth, attack, defense);
    }

    @Override
    public String getClassName() {
        return "Воин";
    }

    @Override
    public int specialAttack() {
        System.out.println(getFighterName()+" наносит мощный удар!");
        return getAttack()*2;
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
