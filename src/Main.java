import model.fighter.Archer;
import model.fighter.Mage;
import model.fighter.Warrior;

void main() {
    Warrior w = new Warrior("Bro", 100, 10, 10);
    Mage m = new Mage("Mag", 100, 10, 0, 100 );
    Archer a = new Archer("I use arch btw", 100, 10, 5, 15);

    w.printInfo();
    m.printInfo();
    a.printInfo();

    m.printInfo();


}
