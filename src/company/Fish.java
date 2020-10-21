package company;

public class Fish extends Animal {
    public int initialPrice = 100;
    public Fish(String name, String gender){
        super(name, gender);
    }

    public int getInitialPrice(){
        return this.initialPrice;
    }
}
