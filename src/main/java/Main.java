import Eceptions.MasterIsBankruptException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Once upon a time ");





        Master master = null;
        try {
            master = new Master(0, 0);
        } catch (IllegalArgumentException | MasterIsBankruptException e) {
            System.out.println(e.getMessage());
        }

        HomeCat homeCat1 = new HomeCat(master, Breed.ABYSSINIAN, "Leya");
        HomeCat homeCat2 = new HomeCat(master, Breed.DONSKOY, "Obi");
        HomeCat homeCat3 = new HomeCat(master, Breed.KORAT, "Yoda");

    }



}
