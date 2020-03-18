import Cats.Breed;
import Cats.HomeCat;
import Cats.Master;
import Cats.WildCat;
import Exceptions.MasterDiedException;
import Exceptions.MasterIsBankruptException;

import java.util.ArrayList;


public class HistoryHowCatsSaveWorld {
    static Master Hitler;
    static HomeCat Archie;
    static ArrayList<WildCat> flock = new ArrayList<>();

    public static void main(String[] args) {
        HistoryHowCatsSaveWorld.aboutArchie();
        HistoryHowCatsSaveWorld.aboutWildCats();
        HistoryHowCatsSaveWorld.catsMeeting();
        HistoryHowCatsSaveWorld.hitlerBankrupt();
        HistoryHowCatsSaveWorld.wildCatsSaveWorld();
        HistoryHowCatsSaveWorld.archieBecomeWild();
        System.out.println("THE END");
    }

    public static void aboutArchie() {
        System.out.println("This history about persian cat! His name is Archie. His owner is Hitler.");
        try {
            Hitler = new Master("Hitler", 100, 2);
        } catch (MasterIsBankruptException e) {
            System.out.println(e.getMessage());
        }
        Archie = new HomeCat(Hitler, "Archie", Breed.PERSIAN);
        System.out.println("Hitler doesn't like his pretty cat,\n" +
                "despite the fact that Hitler mood is increased, when Archie play. They live in Berlin. ");

        try {
            System.out.println(Archie.play() + "\n");
        } catch (MasterDiedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Archie likes lay on sofa so much.");
        System.out.println(Archie.layOnSofa() + "\n");
    }

    public static void aboutWildCats() {
        System.out.println("Near Berlin lives flock of wild cats. Their leader is Kazimir.\n" +
                "They hate war, which has been started by Hitler and want to kill him.\n");

        flock.add(new WildCat("Kazimir"));
        flock.add(new WildCat("Vladimir"));
        flock.add(new WildCat("Aslan"));
        flock.add(new WildCat("Sviatoslav"));
        flock.add(new WildCat("Kornelius"));

        for (WildCat cat : flock) {
            System.out.println(cat.hatePeople() + " especially Hitler!");
        }

        System.out.println("\nSometimes they play with rabbits like now.\n");
        for (WildCat cat : flock) {
            System.out.println(cat.play());
        }
    }

    private static void catsMeeting() {
        System.out.println("\nOn sunny day Archie (Home cat) was walking down the street\n" +
                "when flock of wild cat met him. He was terrified.\n" +
                "He have never seen them earlier.\n" +
                "They started to talk with Archie, played together and found out that they hates Hitler.\n" +
                "They created plan how to kill him.\n");
    }

    private static void hitlerBankrupt() {
        System.out.println("First, Archie has to spoil all Hitler's shoes\n" +
                "for Hitler became bankrupt.After, when Hitler will become bankrupt,\n" +
                "he will lose his house and will live on the street. \n");
        while (true) {
            try {
                System.out.println(Archie.spoilShoes());
            } catch (MasterIsBankruptException e) {
                System.out.println("Hitler is a bankrupt.\n");
                break;
            }
        }
    }

    private static void wildCatsSaveWorld() {
        System.out.println("Then wild cat will save the world by kill Hitler.\n");
        while (true) {
            try {
                for (WildCat wildCat : flock) {
                    System.out.println(wildCat.saveWorld() + "\n" +
                            wildCat.biteSome(Hitler));
                }
            } catch (MasterDiedException e) {
                System.out.println(e.getMessage());
                Hitler = null;
                break;
            }
        }
    }

    private static void archieBecomeWild() {
        System.out.println("\nArchie became a wild cat and stayed live with flock.");
        Archie = null;
        WildCat WildArchie = new WildCat("Archie");
        flock.add(WildArchie);
    }
}


