package company;

public abstract class Animal {
    private int animalHealth;
    private String animalName,animalGender;

    public Animal(int health, String name, String gender ){
        animalHealth = health;
        animalName = name;
        animalGender = gender;
    }

    public getHealth(int health){
        health = animalHealth;
    }
}
