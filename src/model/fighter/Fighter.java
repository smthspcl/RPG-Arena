package model.fighter;

public abstract class Fighter {
    private String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private int level;

    public Fighter(String name,int maxHealth, int attack, int defense) {
        this.maxHealth= maxHealth;
        health = maxHealth;
        level = 1;
        this.name = name;
        this.attack = attack;
        this.defense = defense;

    }

    public void takeDamage(int damage) {
        health -= (damage - defense);
        if(health <= 0) {
            System.out.println(name+" повержен!");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) health = maxHealth;
    }

    public String getFighterName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }


    public int getDefense() {
        return defense;
    }

    public int getInitiative() { return (int) (Math.random()*20) + 1; }

    public void printInfo() {
        System.out.println("- имя: "+name+"\n- класс: "+getClassName()+"\n- уровень: "+level+"\n- здоровье: "+health+"\n- атака: "+attack+"\n- защита: "+defense);
        System.out.println("---------------------");
    }

    public abstract String getClassName();
    public abstract int specialAttack();

}
