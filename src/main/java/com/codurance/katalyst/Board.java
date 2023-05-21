package com.codurance.katalyst;

public class Board {

    private int limit;
    protected Board(int limit){
        this.limit = limit;
    }
    public static Board create(int limit) {
        return new Board(limit);
    }
    public boolean outOfLimit(Coordinate coordinate) {
        throw new UnsupportedOperationException();
    }
    
}
