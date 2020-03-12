public class WildCat extends Cat implements Playable{

    WildCat(String name) {
        super(name);
    }

    public  String hatePeople(){
        return getName()+": I hate people";
    }
    public String saveWorld(){
        return  getName()+": I'm killing Hitler";
    }

    public String play() {
        return  getName()+": I'm playing with rabbits";
    }
}
