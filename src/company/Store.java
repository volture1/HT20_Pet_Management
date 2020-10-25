package company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Store {

    public Store(){
    }
    public void animalPurchase(Player player) {
        Scanner input = new Scanner(System.in);

        System.out.println("--Animal shop--\n" +
                "[1] 100$ Fish\n" +
                "[2] 200$ Hamster\n" +
                "[3] 350$ Cat\n" +
                "[4] 500$ Dog\n" +
                "[5] 700$ Monkey");

        int choice = 1;
        boolean continueLoope = false;

        while (!continueLoope) {
            try {
                choice = input.nextInt();
                continueLoope = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Wrong type of input");
                input.next();
                continue;
            }
        }
        switch (choice) {
            case 1:
                if(player.playerMoney >= 100){
                    System.out.println("Name your new fish: ");
                    var name = input.next();
                    var gender = player.rollGender();
                    player.animals.add(new Fish( name, gender));
                    player.removeCash(100);
                    System.out.println("You bought a " + gender + " fish called " + name + " for $100");
                    System.out.println("Your balance is $" + player.playerMoney);
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $100");
                }
                break;
            case 2:
                if(player.playerMoney >= 200){
                    System.out.println("Name your new Hamster: ");
                    var name = input.next();
                    var gender = player.rollGender();
                    player.animals.add(new Hamster(name, gender));
                    player.removeCash(200);
                    System.out.println("You bought a " + gender + " hamster called " + name + " for $200");
                    System.out.println("Your balance is $" + player.playerMoney);

                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $200");
                }
                break;
            case 3:
                if(player.playerMoney >= 350) {
                    System.out.println("Name your new cat: ");
                    var name = input.next();
                    var gender = player.rollGender();
                    player.animals.add(new Cat(name,gender));
                    player.removeCash(350);
                    System.out.println("You bought a " + gender + " cat called " + name + " for $350");
                    System.out.println("Your balance is $" + player.playerMoney);
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $350");
                }
                break;
            case 4:
                if(player.playerMoney >= 500){
                    System.out.println("Name your new dog: ");
                    var name = input.next();
                    var gender = player.rollGender();
                    player.animals.add(new Dog(name,gender));
                    player.removeCash(500);
                    System.out.println("You bought a " + gender + " dog called " + name + " for $500");
                    System.out.println("Your balance is $" + player.playerMoney);
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $500");
                }
                break;
            case 5:
                if(player.playerMoney >= 700){
                    System.out.println("Name your new Monkey: ");
                    var name = input.next();
                    var gender = player.rollGender();
                    player.animals.add(new Monkey(name,gender));
                    player.removeCash(700);
                    System.out.println("You bought a " + gender + " monkey called " + name + " for $700");
                    System.out.println("Your balance is $" + player.playerMoney);
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $700");
                }
                break;
        }
    }
    public void foodPurchase(Player player){
        Scanner input = new Scanner(System.in);

        System.out.println("--Food shop--\n" +
                "[1] 50$/kg Fish food\n" +
                "[2] 75$/kg Carrot\n" +
                "[3] 150$/kg Meat\n");

        int choice = 1;
        boolean continueLoope = false;
        while (!continueLoope) {
            try {
                choice = input.nextInt();

                continueLoope = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Wrong type of input");
                input.next();
                continue;
            }
        }
        switch(choice) {
            case 1:
                if(player.playerMoney >= 50){
                    player.removeCash(50);
                    System.out.println("You bought 1 kg of fish food for $50 and your balance is now $"+ player.playerMoney);
                    player.foods.add(new FishFood("Fish food"));
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the food you wanted to purchase costs $50");
                }
                break;
            case 2:
                if(player.playerMoney >= 75){
                    player.removeCash(75);
                    System.out.println("You bought 1 kg of carrots for $75 and your balance is now $"+ player.playerMoney);
                    player.foods.add(new Carrot("Carrot"));
                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the food you wanted to purchase costs $75");
                }
                break;
            case 3:
                if(player.playerMoney >= 150){
                    player.removeCash(150);
                    System.out.println("You bought 1 kg of fish food for $150 and your balance is now $"+ player.playerMoney);
                    player.foods.add(new Meat("Meat"));
                } else{
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the food you wanted to purchase costs $150");
                }
                break;
        }
    }
}
