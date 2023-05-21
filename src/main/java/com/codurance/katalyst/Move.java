package com.codurance.katalyst;

public enum Move {
    LEFT,
    RIGHT,
    NULL;
    public static Move from(String value) {
        if("R".equals(value)){
            return Move.RIGHT;
        }
        if("L".equals(value)) {
            return Move.LEFT;
        }
        return Move.NULL;
    }
}
