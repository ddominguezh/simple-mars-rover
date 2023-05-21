package com.codurance.katalyst;

public enum Rotate {
    LEFT,
    RIGHT,
    NULL;
    public static Rotate from(String value) {
        if("R".equals(value)){
            return Rotate.RIGHT;
        }
        if("L".equals(value)) {
            return Rotate.LEFT;
        }
        return Rotate.NULL;
    }
}
