package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoveTest {
    
    @Test
    public void create_left_move(){
        assertEquals(Move.LEFT, Move.from("L"));
    }
}
