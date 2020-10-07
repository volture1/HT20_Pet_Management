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
        int rounds, playerAmount;
        Scanner input = new Scanner(System.in);
        //SETTING ROUNDS
        do{
            System.out.println("Enter how many rounds you would like to play (5-30)");
            rounds = input.nextInt();
            if(rounds < 5){
                System.out.println("Please enter a number larger than 5.");
            }
            else if(rounds > 30){
                System.out.println("Please enter a number lower than 30.");
            }
        }while(rounds < 5 || rounds > 30);
        //SETTING PLAYERS
        do{
            System.out.println("Enter the amount of players for this game (1-4)");
            playerAmount = input.nextInt();

            if(playerAmount < 1){
                System.out.println("Please enter a number larger than 1.");
            }
            else if(playerAmount > 4){
                System.out.println("Please enter a number lower than 4.");
            }
        }while(playerAmount < 1 || playerAmount > 4);

        System.out.println("----RULES----");
        System.out.println("Amount of rounds: " + rounds);
        System.out.println("Amount of players: " + playerAmount);
    }

}
