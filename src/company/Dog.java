package company;

public class Dog extends Animal {
    public int initialPrice = 500;
    public String animalType = "Dog";
    public Dog( String name, String gender){

        super(name, gender);
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }
    public String getType(){
        return this.animalType;
    }

}
