package company;

public class Carrot extends Food {
    public int foodPrice = 75;
    public int healthPoints = 20;

    public Carrot(String name){
        super(name);
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
}
