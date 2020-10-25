package company;

public class FishFood extends Food {
    public int foodPrice = 25;
    public int healthPoints = 10;
    public String type = "FishFood";
    public FishFood(String name){
        super(name);
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
    public String getType(){
        return this.type;
    }
}
