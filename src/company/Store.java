package company;

import java.util.Random;
import java.util.Scanner;

public class Store {

    public Store(){

    }

    public void menuSelect(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please select something");
        System.out.println("[1] Buy Animals");
        System.out.println("[2] Sell Animals");
        System.out.println("[3] Buy Food");
        System.out.println("[4] Return");
        int choice = input.nextInt();
        if(choice == 1){
            animalPurchase();
        }else if(choice ==2){

        }else if(choice ==3){

        }else{

        }
    }
    public void animalPurchase(){

    }
    public void foodPurchase(){

    }

}
