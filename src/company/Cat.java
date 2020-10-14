package company;

public class Cat extends Animal {
    public static int initialPrice = 1000;
    public Cat(String name, String gender){
        super(100, name, gender);
    }


    public void getPrice(int price){
        System.out.println("The cost of the cat is "+price);
    }
}
