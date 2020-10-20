package company;

public abstract class Animal {
    public int health = 100;
    private String name,gender;

    public Animal(String name, String gender ){
        this.name = name;
        this.gender = gender;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    /*public void add(Animal animal){

    }*/
}
