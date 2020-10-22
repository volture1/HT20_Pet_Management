package company;

public class Monkey extends Animal {

    public int initialPrice = 700;
    private String animalType = "Monkey";
    public Monkey(String name, String gender){
        super(name, gender);
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }
    public String getType(){
        return this.animalType;
    }
}
