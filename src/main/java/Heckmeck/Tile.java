package Heckmeck;

public class Tile implements Comparable<Tile>{
    private final int number;
    private final int warm;

    Tile(int number, int warm) {
        this.number = number;
        this.warm = warm;
    }

    public int getNumber() {
        return number;
    }

    public int getWarm() {
        return warm;
    }

    @Override
    public int compareTo(Tile other) throws NullPointerException{
        return hasSameNumber(other) ? this.getWarm() - other.getWarm() : this.getNumber() - other.getNumber();
    }

    private boolean hasSameNumber(Tile other) {
        return this.getNumber() == other.getNumber();
    }
}
