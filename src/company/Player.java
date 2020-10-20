package company;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private String playerName;
    public int playerMoney = 400;


    public ArrayList<Animal> animals = new ArrayList<Animal>();

    public Player(String name){
        playerName = name;
    }
    public int getCash() {
        return playerMoney;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void removeCash(int cash){
        playerMoney = playerMoney - cash;
    }
    public void printAnimals(){
        int id = 1;
        for (var Animal : animals){
            if(Animal.health > 1){
                System.out.println(id+ " " + Animal.getName() + " has " + Animal.getHealth() + "% health");
                id++;
            }else if(Animal.health < 1){
                animals.remove(Animal);
            }

        }
    }
    public void healthDecay(){
        for (var animal : animals){
            //Add random from 10-30 to remove health from each animal every round.
            Random rand = new Random();
            var value = 10 +rand.nextInt(20);
            animal.health = animal.health - value;
           // System.out.println(Animal.health);
        }
    }


    }




