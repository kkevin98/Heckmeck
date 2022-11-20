package Heckmeck;

import java.util.LinkedList;

public class Player {

    static int numberOfPlayers = 0;
    private final String playerName;
    private LinkedList<Tile> playerTiles = new LinkedList<>();


    public Player(String playerName) {
        this.playerName = playerName;
        numberOfPlayers++;
    }

    public Player() {
        this.playerName = "Player" + numberOfPlayers;
        numberOfPlayers++;
    }


    public String getName(){
        return this.playerName;
    }

    public boolean hasTiles() { return playerTiles.size() != 0; }

//    public void PickATileFromPlayground(int tileNumber)

}
