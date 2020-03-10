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

    public void spoilShoes(){
        try {
            master.decreaseAmountOfMoney();
        } catch (MasterIsBankruptException e) {
            System.out.println(e.getMessage());
        }
    }

    public void play() {
        try {
            master.increaseMood();
        } catch (MasterDiedException e) {
            System.out.println(e.getMessage());
        }
    }
}
