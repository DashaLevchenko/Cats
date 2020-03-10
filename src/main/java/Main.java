import Eceptions.MasterIsBankruptException;

public class Main {
    public static void main(String[] args) {
        Master master = null;
        try {
            master = new Master(0, 0);
        } catch (IllegalArgumentException | MasterIsBankruptException e) {
            System.out.println(e.getMessage());
        }

        HomeCat homeCat1 = new HomeCat(master, Breed.ABYSSINIAN, "Kuzia");
        HomeCat homeCat2 = new HomeCat(master, Breed.DONSKOY, "Murzik");
        HomeCat homeCat3 = new HomeCat(master, Breed.KORAT, "Sonia");

    }



}
