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

        var rounds = Dialogs.promptInt("Enter how many rounds you would like to play (5-30)", 5,30);
        var playerAmount = Dialogs.promptInt("Enter the amount of players (1-4)", 1,4);

        System.out.println("----RULES----");
        System.out.println("Amount of rounds: " + rounds);
        System.out.println("Amount of players: " + playerAmount);
    }

}
