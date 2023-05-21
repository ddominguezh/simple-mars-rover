package com.codurance.katalyst;

public enum Move {
    LEFT,
    RIGHT;
    public static Move from(String value) {
        if("R".equals(value)){
            return Move.RIGHT;
        }
        return Move.LEFT;
    }
}
