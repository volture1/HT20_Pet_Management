package company;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int playerCash = 5000;


    public ArrayList<Animal> animals = new ArrayList<Animal>();
    public Player(String name){
        playerName = name;
    }
    public int getCash() {
        return playerCash;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }



}
