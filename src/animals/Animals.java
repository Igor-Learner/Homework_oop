package animals;

public abstract class Animals {
    String title;
    String name;
    String animalClass;
    String animalSquad;
    public Animals(String title, String name){
        this.title = title;
        this.name = name;
    }
    public String getAnimalClass() {
        return animalClass;
    };
    public String getAnimalSquad() {
        return animalSquad;
    };
};

