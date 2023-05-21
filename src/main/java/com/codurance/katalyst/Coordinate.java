package com.codurance.katalyst;

public class Coordinate {
    
    private int x;
    private int y;
    protected Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static Coordinate create(int x, int y){
        assert(x >= 0);
        assert(y >= 0);
        return new Coordinate(x, y);
    }
    public Coordinate move(Direction direction){
        return null;
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
