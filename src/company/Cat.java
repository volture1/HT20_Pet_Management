package company;

public class Cat extends Animal {
    public int initialPrice  = 350;
    public String animalType = "Cat";
    public Cat(String name, String gender){
        super(name, gender);
    }

    public String getType(){
        return this.animalType;
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }
    public void getPrice(int price){
        System.out.println("The cost of the cat is "+price);
    }
}
