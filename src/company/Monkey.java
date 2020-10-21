package company;

public class Monkey extends Animal {

    public int initialPrice = 700;
    public Monkey(String name, String gender){
        super(name, gender);
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }
}
