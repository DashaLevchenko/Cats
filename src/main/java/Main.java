import Exceptions.MasterIsBankruptException;

import java.util.ArrayList;


public class Main {
    static Master Hitler;
    static HomeCat Archie;
    static ArrayList<WildCat> flock = new ArrayList<>();

    public static void main(String[] args) {
        Main.aboutArchie();
        Main.aboutWildCats();
        Main.catsMeeting();
        Main.hitlerBankrupt();
        Main.wildCatsSaveWorld();
        Main.archieBecomeWild();
        System.out.println("THE END");
    }

    private static void archieBecomeWild() {
        System.out.println("Archie became a wild cat and stayed live with flock.");
        Archie = null;
        WildCat WildArchie = new WildCat("Archie");
        flock.add(WildArchie);
    }

    private static void wildCatsSaveWorld() {
        System.out.println("Then wild cat will save the world by kill Hitler.\n");
        for (WildCat wildCat : flock) {
            System.out.println(wildCat.saveWorld());
        }

        System.out.println("Hitler died.\n");
    }

    private static void hitlerBankrupt() {
        System.out.println("First, Archie have to spoil all Hitler's shoes " +
                "for Hitler became bankrupt.After, when Hitler became bankrupt," +
                " he lost his house and will live on the street. \n");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Archie.spoilShoes());
            } catch (MasterIsBankruptException e) {
                System.out.println("Hitler is a bankrupt.\n");
            }
        }
    }

    private static void catsMeeting() {
        System.out.println("On sunny day Archie (Home cat) was walking down the street" +
                " when flock of wild cat met him. He was terrified." +
                "He have never seen them earlier.\n"+
                "They started to talk with Archie, played together and defined that they hated Hitler. " +
                "They created plan how to kill him.\n");
    }

    public static void aboutArchie() {
        System.out.println("This history about persian cat. His name is Archie. His owner is Hitler.");
        try {
            Hitler = new Master(100, 2);
        } catch (MasterIsBankruptException e) {
            System.out.println(e.getMessage());
        }
        Archie = new HomeCat(Hitler, "Archie", Breed.PERSIAN);
        System.out.println("Hitler doesn't like his pretty cat. They live in Berlin.\n");

        System.out.println("Archie likes lay on sofa so much.");
        System.out.println(Archie.layOnSofa());
        System.out.println(Archie.layOnSofa());
        System.out.println(Archie.layOnSofa());
    }

    public static void aboutWildCats() {
        System.out.println("Near Berlin lives flock of wild cats. Their leader is Kazimir." +
                "They hate war, which has been started by Hitler and want to kill him.\n");

        flock.add(new WildCat("Kazimir"));
        flock.add(new WildCat("Vladimir"));
        flock.add(new WildCat("Aslan"));
        flock.add(new WildCat("Sviatoslav"));
        flock.add(new WildCat("Kornelius"));

        for(WildCat cat : flock){
            System.out.println(cat.hatePeople()+" especially Hitler");
        }

        System.out.println("Sometimes they play with rabbits like now.\n");
        for(WildCat cat : flock){
            System.out.println(cat.play());
        }
    }

}
