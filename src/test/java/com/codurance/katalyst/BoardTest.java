package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {
    
    @Test
    public void out_of_upper_limit(){
        assertTrue(Board.create(10).outOfLimit(Coordinate.create(10, 4)));
    }
}
