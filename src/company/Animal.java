package company;

public abstract class Animal {
    private int health;
    private String name,gender;

    public Animal(int health, String name, String gender ){
        this.health = health;
        this.name = name;
        this.gender = gender;
    }

    public void getHealth(int health){
        health = this.health;
    }

    public void getName(){
        System.out.println(this.name);
    }
    public void add(Animal animal){

    }
}
