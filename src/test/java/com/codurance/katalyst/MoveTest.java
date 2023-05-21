package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoveTest {
    
    @Test
    public void create_left_move(){
        assertEquals(Move.LEFT, Move.from("L"));
    }

    @Test
    public void create_right_move(){
        assertEquals(Move.RIGHT, Move.from("R"));
    }

    @Test
    public void create_null_move(){
        assertEquals(Move.NULL, Move.from("D"));
    }
}
