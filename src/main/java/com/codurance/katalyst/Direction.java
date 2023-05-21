package com.codurance.katalyst;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction rotate(Rotate value) {
        if(Rotate.LEFT.equals(value)){
            return rotateLeft();
        }
        return rotateRight();
    }

    private Direction rotateLeft(){
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

    private Direction rotateRight(){
        if(Direction.NORTH.equals(this)){
            return Direction.WEST;
        }
        if(Direction.WEST.equals(this)){
            return Direction.SOUTH;
        }
        if(Direction.SOUTH.equals(this)){
            return Direction.EAST;
        }
        return Direction.NORTH;
    }
}
