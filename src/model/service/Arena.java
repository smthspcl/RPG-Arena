package model.service;

import model.FighterStats;
import model.fighter.Fighter;

import java.util.*;

public class Arena {
    private String name;
    private List<Fighter> fighters;
    private static Map<String, FighterStats> stats;
    private List<String> battleLog;

    public Arena(String name) {
        this.name = name;
        this.fighters = new ArrayList<>();
        Arena.stats = new HashMap<>();
        this.battleLog = new ArrayList<>();
    }


    public void registerFighter(Fighter fighter) {
        fighters.add(fighter);
        FighterStats stat = new FighterStats();
        stats.put(fighter.getFighterName(), stat);
    }

    public static FighterStats getFighterStats(String name) {
        return stats.get(name);
    }

    public void recordBattle(Fighter winner, Fighter loser, int gold) {
        stats.get(winner.getFighterName()).addWin(gold);
        stats.get(loser.getFighterName()).addLoss();
        stats.get(winner.getFighterName()).addDamage(loser.getMaxHealth());
        stats.get(loser.getFighterName()).addDamage(winner.getMaxHealth()-winner.getHealth());


    }

    public static void printAllStats() {
        for(Map.Entry entry : stats.entrySet()) {
            System.out.println("Статистика: "+entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
