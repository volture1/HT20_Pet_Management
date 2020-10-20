package company;

import java.util.Random;
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
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                //player buying a cat
                int cash = player.getCash();
                if(cash > 400){
                   // player.animals.add()
                }
                    break;
            case 2:
                //store.foodPurchase();
                break;
            case 3:
                //player.feedAnimal();
                //create feature that makes player own animal objects.
                //sout("select animal to feed");
                //-- select object
                //sout("select food to feed animal with");
                //--select food to feed animal with (+10 hp to animal)
                break;
            case 4:
                //--print list of animals--
                //sout("please select two animals to breed, one of each gender")
                //either player.breedAnimal or animal.breedAnimal
                break;
            case 5:
                //player.sellAnimal
                //player will sell their animal object for money.
                break;
        }

    }
    public void foodPurchase(){

    }


}
