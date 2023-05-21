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
        return coordinate.x() >= limit || coordinate.x() < 0 
            || coordinate.y() >= limit || coordinate.y() < 0;
    }
    public Coordinate opposite(Coordinate coordinate) {
        if(coordinate.x() >= limit){
            return Coordinate.create(coordinate.y(), 0);
        }
        if(coordinate.x() < 0){
            return Coordinate.create(coordinate.y(), limit - 1);
        }
        if(coordinate.y() >= limit){
            return Coordinate.create(0, coordinate.x());
        }
        if(coordinate.y() < 0){
            return Coordinate.create(limit - 1, coordinate.x());
        }
        return coordinate;
    }
    
}
