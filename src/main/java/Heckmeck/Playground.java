package Heckmeck;

import java.util.TreeSet;

public class Playground{

    private TreeSet<Tile> availableTiles = new TreeSet<>();

    public Playground(){
        availableTiles.add(new Tile(21, 1));
        availableTiles.add(new Tile(22, 1));
        availableTiles.add(new Tile(23, 1));
        availableTiles.add(new Tile(24, 1));
        availableTiles.add(new Tile(25, 2));
        availableTiles.add(new Tile(26, 2));
        availableTiles.add(new Tile(27, 2));
        availableTiles.add(new Tile(28, 2));
        availableTiles.add(new Tile(29, 3));
        availableTiles.add(new Tile(30, 3));
        availableTiles.add(new Tile(31, 3));
        availableTiles.add(new Tile(32, 3));
        availableTiles.add(new Tile(33, 4));
        availableTiles.add(new Tile(34, 4));
        availableTiles.add(new Tile(35, 4));
        availableTiles.add(new Tile(36, 4));
    }

    public boolean hasTileNumber(int tileNumber) {
        return availableTiles.stream()
                .filter(tile -> tile.getNumber() == tileNumber)
                .findAny()
                .isPresent();
    }
}
