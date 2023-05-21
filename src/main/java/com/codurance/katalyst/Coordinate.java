package com.codurance.katalyst;

public class Coordinate {
    
    private int y;
    private int x;
    protected Coordinate(int y, int x){
        this.y = y;
        this.x = x;
    }
    public static Coordinate create(int y, int x){
        return new Coordinate(y, x);
    }
    public Coordinate move(Direction direction){
        if(Direction.NORTH.equals(direction)){
            return new Coordinate(y + 1, x);
        }
        if(Direction.EAST.equals(direction)){
            return new Coordinate(y, x - 1);
        }
        if(Direction.SOUTH.equals(direction)){
            return new Coordinate(y - 1, x);
        }
        return new Coordinate(y, x + 1);
    }
    public int x() {
        return this.x;
    }
    public int y() {
        return this.y;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coordinate other = (Coordinate) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
}
