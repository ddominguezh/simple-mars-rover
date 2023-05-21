package com.codurance.katalyst;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction move(Move value) {
        if(Move.LEFT.equals(value)){
            return moveLeft();
        }
        return moveRight();
    }

    private Direction moveLeft(){
        if(Direction.NORTH.equals(this)){
            return Direction.EAST;
        }
        if(Direction.EAST.equals(this)){
            return Direction.SOUTH;
        }
        if(Direction.SOUTH.equals(this)){
            return Direction.WEST;
        }
        return Direction.NORTH;
    }

    private Direction moveRight(){
        return Direction.WEST;
    }
}
