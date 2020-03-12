import Exceptions.MasterDiedException;

public class WildCat extends Cat implements Playable{

    WildCat(String name) {
        super(name);
    }

    public  String hatePeople(){
        return getName()+": I hate people";
    }
    public String saveWorld(){
        return  getName()+": I'm saving world.";
    }

    public String biteSome(Object object) throws MasterDiedException {
        if (object instanceof Master) {
            ((Master) object).reduceHealth();
        }
        return  getName()+": I'm biting "+object.toString();
    }

    public String play() {
        return  getName()+": I'm playing with rabbits.";
    }
}
