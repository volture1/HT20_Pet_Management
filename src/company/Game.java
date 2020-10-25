package company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    public Game(){
        System.out.println("Work in progress.");
        Store store = new Store();
        startMenu();
        newGame();
    }

    static void startMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Pet Management");
        System.out.println("Purchase and breed your pets, nurture them then sell them ALL to earn CCCCCASH");
        System.out.println("Created by Tobias Östergren for Teknikhögskolan HT20");
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }
     void newGame(){
        Scanner input = new Scanner(System.in);
        var totalRounds = Dialogs.promptInt("Enter how many rounds you would like to play (5-30)", 5,30);
        var playerAmount = Dialogs.promptInt("Enter the amount of players (1-4)", 1,4);

        System.out.println("----RULES----");
        System.out.println("Amount of rounds: " + totalRounds);
        System.out.println("Amount of players: " + playerAmount);

        Player[] playerNames = new Player[playerAmount];

        // Setting player names
        for (int i = 1; i < playerAmount + 1; i++) {
            System.out.println("Player number [" + i + "] please enter your name: ");
            String name = input.nextLine();
            playerNames[i-1] = new Player(name);
        }

        //Printing player names
        System.out.println("-Players-");
        for (Player player: playerNames){
            System.out.println(player.getPlayerName());
        }


        //A loop for each round for each player.
        //first loop will go to 1, then it will loop through ALL players until it will go to 2....
        for(var round = 1; round <= totalRounds; round++){
            for (Player player: playerNames){
                System.out.println("Runda " + round + " av " + totalRounds + ", spelare " + player.getPlayerName() + ":s tur...");
                gameLoop(player);
            }
        }
    }
    static void gameLoop(Player player){

        Scanner input = new Scanner(System.in);
        Dialogs dialog = new Dialogs();
        Store store = new Store();
        boolean continueRound = true;
        System.out.println("--Your balance is $" + player.playerMoney + " and these are your animals--");
        player.printAnimals();
        System.out.println("---------------------------");

        do {
            System.out.println("[1] Purchase Animal\n" +
                    "[2] Purchase Food\n" +
                    "[3] Feed Animal\n" +
                    "[4] Breed Animal\n" +
                    "[5] Sell Animal\n" +
                    "[6] End round");
            int choice = 1;
            boolean continueLoope = false;
            while (!continueLoope) {
                try {
                    choice = input.nextInt();
                    continueLoope = true;
                }
                catch(InputMismatchException e) {
                    System.out.println("Wrong type of input");
                    input.next(); // clear scanner wrong input
                    continue;
                }
            }
            switch(choice){
                case 1:
                    store.animalPurchase(player);
                    break;
                case 2:
                    store.foodPurchase(player);
                    break;
                case 3:
                    player.feedAnimal(player);
                    break;
                case 4:
                    player.breedAnimal(player);
                    break;
                case 5:
                    player.sellAnimal(player);
                    //player will sell their animal object for money.
                    break;
                case 6:
                    //Ends the round for the player.
                    player.healthDecay();
                    continueRound= false;
                    break;
            }
            // System.out.print("\n".repeat(5));
        }while(continueRound);


    }

}
