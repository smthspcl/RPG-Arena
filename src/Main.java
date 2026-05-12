import model.fighter.Archer;
import model.fighter.Fighter;
import model.fighter.Mage;
import model.fighter.Warrior;
import model.service.Arena;
import model.service.BattleEngine;


void main() {
    Warrior w = new Warrior("Bro", 100, 10, 6);
    Mage m = new Mage("Mag", 100, 10, 0, 100 );
    Archer a = new Archer("I use arch btw", 100, 10, 5, 15);

    Arena arena = new Arena("Arena");

    arena.registerFighter(w);
    arena.registerFighter(m);

    BattleEngine.fullBattle(w,m);

    Arena.getFighterStats("Bro");

}
