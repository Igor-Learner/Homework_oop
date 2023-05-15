package animals;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Cat extends Animals{
        public Cat(String title, String name) {
        super(title, name);
        System.out.println(title + " " + name);
        }
    public String getAnimalClass(){
        String animalClass  = "млекопитающее";
        return getAnimalClass();
        }
        public void setAnimalClass(String animalClass) {
            this.animalClass = animalClass;
        }
    public String getAnimalSquad(){
        String animalClass  = "хищные";
        return getAnimalSquad();
    };
}
