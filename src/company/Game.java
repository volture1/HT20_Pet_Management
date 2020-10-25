package company;

import java.util.*;

public class Game {

    public Game(){
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
         ArrayList<Player> playerNames = new ArrayList<Player>();

         for (int i = 1; i < playerAmount + 1; i++) {
             System.out.println("Player number [" + i + "] please enter your name: ");
             String name = input.nextLine();
             playerNames.add(new Player(name));
         }

         System.out.println("-Players-");
         for (Player player: playerNames){
             System.out.println(player.getPlayerName());
         }

         for(var round = 1; round <= totalRounds; round++){
             for (Player player: playerNames){
                 System.out.println("Runda " + round + " av " + totalRounds + ", spelare " + player.getPlayerName() + ":s tur...");
                 gameLoop(player);
             }
         }
         System.out.println("-----------------------------\n" +
                 "          GAME OVER\n" +
                 "-----------------------------\n" +
                 "         -Score board-");
         for (Player player : playerNames){
             for(Animal animal : player.animals){
                 int price = animal.getInitialPrice() * animal.getHealth();
                 player.playerMoney = price + player.playerMoney;

             }
         }
         playerNames.sort((Player a, Player b) -> { return a.playerMoney > b.playerMoney ? -1 : 1; });
         int id = 1;
         for(Player player: playerNames){
             System.out.println("[" + id + "] $" + player.playerMoney + " - " +  player.getPlayerName());
             id++;
         }
         System.out.println("-------------------------------");
         System.out.println("Play again? \n" +
                            "[1] Yes\n" +
                            "[2] No");
         int again = input.nextInt();
         switch(again){
             case 1:
                 newGame();
                 break;
             case 2:
                 break;
             default:
                 break;
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
                    input.next();
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
                    break;
                case 6:
                    player.healthDecay();
                    continueRound= false;
                    break;
            }
        }while(continueRound);
    }
}
