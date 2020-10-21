package company;

public class FishFood extends Food {
    public int foodPrice = 25;
    public int healthPoints = 10;
    public FishFood(String name){
        super(name);
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
}
