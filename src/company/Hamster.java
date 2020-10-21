package company;

public class Hamster extends Animal {
    public int initialPrice = 200;
    public Hamster(String name, String gender){
        super(name, gender);
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }
}
