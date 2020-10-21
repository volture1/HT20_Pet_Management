package company;

public abstract class Food {
    public int foodPrice;
    public int healthPoints;
    private String name;


    public Food(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getHealthPoints(){
       return this.healthPoints;
    }
}
