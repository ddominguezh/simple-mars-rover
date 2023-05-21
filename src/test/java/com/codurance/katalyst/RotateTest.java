package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RotateTest {
    
    @Test
    public void create_left_move(){
        assertEquals(Rotate.LEFT, Rotate.from("L"));
    }

    @Test
    public void create_right_move(){
        assertEquals(Rotate.RIGHT, Rotate.from("R"));
    }

    @Test
    public void create_null_move(){
        assertEquals(Rotate.NULL, Rotate.from("D"));
    }
}
