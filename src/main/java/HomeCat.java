import Eceptions.MasterDiedException;
import Eceptions.MasterIsBankruptException;

public class HomeCat extends Cat implements Playable{
    private Master master;

    HomeCat(Master master, Breed breed, String name){
        this.master = master;
        setBreed(breed);
        setName(name);
    }

    public void layOnSofa() {
        System.out.println("Cat is purring");
    }

    public void spoilShoes() throws MasterIsBankruptException {
            master.decreaseAmountOfMoney();
    }

    public void play() throws MasterDiedException {
            master.increaseMood();
    }
}
