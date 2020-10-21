package company;

import java.util.ArrayList;
import java.util.Iterator;
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


        /*for (int i = animals.size() - 1; i <= 0 ; i--) {
            if(animal < 1){
                animals.remove(i);
            }
        }*/
        int id = 0;
        var animalsToDelete = new ArrayList<Animal>();

        for (var animal : animals){
            if(animal.health > 1){
                System.out.println(id+ " " + animal.getName() + " has " + animal.getHealth() + "% health");
                id++;
            }else if(animal.health < 1){
                //animals.remove(animal);
                  animalsToDelete.add(animal);
            }
        }
        for(var key : animalsToDelete){
            animals.remove(key);
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




