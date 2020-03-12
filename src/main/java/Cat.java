abstract class Cat {
    public String getName() {
        return name;
    }

    private String name;
    private Breed breed;

    Cat(String name){
        this.name = name;
        this.breed = Breed.WILD_CAT;
    }

    Cat(String name, Breed breed){
        this.name = name;
        this.breed = breed;
    }
}
