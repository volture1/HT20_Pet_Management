package company;

public class Dog extends Animal {
    public int initialPrice = 500;
    public Dog( String name, String gender){

        super(name, gender);
    }
    public int getInitialPrice(){
        return this.initialPrice;
    }

}
