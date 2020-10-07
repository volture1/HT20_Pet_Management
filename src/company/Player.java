package company;

public class Player {
    private String playerName;
    private int playerCash = 5000;

    public Player(String name){
        playerName = name;
    }
    public int getCash() {
        return playerCash;
    }
}
