package company;

import java.util.Random;
import java.util.Scanner;
//-----------MUNDANE THINGS TO FIX----------------------
//1. The male/female roll on all bought animals : DONE
//2. The purchase sequence on every animal : DONE
//3.--
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
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                if(player.playerMoney >= 100){
                    System.out.println("Name your new fish: ");
                    var name = input.next();
                    var gender = rollGender();
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
                if(player.playerMoney > 200){
                    System.out.println("Name your new Hamster: ");
                    var name = input.next();
                    var gender = rollGender();
                    player.animals.add(new Hamster( name, gender));
                    player.removeCash(200);
                    System.out.println("You bought a " + gender + " hamster called " + name + " for $200");
                    System.out.println("Your balance is $" + player.playerMoney);

                }else {
                    System.out.println("Insufficient funds. Your balance is $" + player.playerMoney +
                            " and the animal you wanted to purchase costs $200");
                }
                break;
            case 3:
                if(player.playerMoney > 350) {
                    System.out.println("Name your new cat: ");
                    var name = input.next();
                    var gender = rollGender();
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
                if(player.playerMoney > 500){
                    System.out.println("Name your new dog: ");
                    var name = input.next();
                    var gender = rollGender();
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
                if(player.playerMoney > 700){
                    System.out.println("Name your new Monkey: ");
                    var name = input.next();
                    var gender = rollGender();
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
    public void foodPurchase(){

    }
     private String rollGender() {
         Random rand = new Random();
         var number = rand.nextInt(2) + 1;
         if (number == 1) {
             return "Male";
         } else if (number == 2)
         {
             return "Female";
         }
         else{
             return null;
         }

     }

}
