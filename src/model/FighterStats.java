package model;

public class FighterStats {

    private int wins;
    private int losses;
    private int totalDamageDealt;
    private int totalGoldEarned;

    public void addWin(int gold) {
        totalGoldEarned+=gold;
        wins++;
    }

    public void addLoss() {
        losses++;
    }

    public void addDamage(int damage) {
        totalDamageDealt+=damage;
    }

    public double getWinrate() {
        return (double) wins /(wins+losses)*100;
    }

    public void printStats() {
        System.out.println("Всего побед: "+wins);
        System.out.println("Всего поражений: "+losses);
        System.out.println("Всего нанесено урона: "+totalDamageDealt);
        System.out.println("Всего получено золота: "+totalGoldEarned);
    }
}


