package Cats;

import Exceptions.MasterDiedException;
import Exceptions.MasterIsBankruptException;

public class HomeCat extends Cat implements Playable {
    private Master master;

    public HomeCat(Master master, String name, Breed breed) {
        super(name, breed);
        this.master = master;
    }

    public String layOnSofa() {
        return  getName() + ": I'm laying on sofa and purring";
    }

    public String spoilShoes() throws MasterIsBankruptException {
        master.decreaseAmountOfMoney();
        return getName()+": I'm spoiling shoes";
    }

    public String play() throws MasterDiedException {
        master.increaseMood();
        return  getName()+": I'm playing with my owner";
    }
}
