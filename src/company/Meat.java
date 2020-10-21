package company;

public class Meat extends Food {
    public int foodPrice = 150;
    public int healthPoints = 40;

    public Meat(String name){
        super(name);
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
}
