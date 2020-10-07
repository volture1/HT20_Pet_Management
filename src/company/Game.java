package company;


import java.util.Scanner;

public class Game {

    public Game(){
        System.out.println("Work in progress.");
        startMenu();
        newGame();
    }

    static void startMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Pet Management!");
        System.out.println("Purchase and breed your pets, nurture them then sell them ALL to earn CCCCCASH");
        System.out.println("Created by Tobias Östergren for Teknikhögskolan HT20");
        System.out.println("-------------------------------------------------------");
        System.out.println();


    }
    static void newGame(){
        boolean correct;
        int rounds, playerAmount;

        Scanner input = new Scanner(System.in);
    }

}
