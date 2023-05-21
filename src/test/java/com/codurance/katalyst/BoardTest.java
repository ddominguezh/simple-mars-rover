package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {
    
    @Test
    public void within_limits(){
        assertFalse(Board.create(10).outOfLimit(Coordinate.create(0, 0)));
        assertFalse(Board.create(10).outOfLimit(Coordinate.create(9, 9)));
    }

    @Test
    public void out_of_upper_limit(){
        assertTrue(Board.create(10).outOfLimit(Coordinate.create(10, 4)));
    }

    @Test
    public void out_of_lower_limit(){
        assertTrue(Board.create(10).outOfLimit(Coordinate.create(-1, 4)));
    }

    @Test
    public void out_of_lower_right(){
        assertTrue(Board.create(10).outOfLimit(Coordinate.create(5, 10)));
    }

    @Test
    public void out_of_lower_left(){
        assertTrue(Board.create(10).outOfLimit(Coordinate.create(5, -1)));
    }

    @Test
    public void opposite_coordinate_out_of_upper_limit(){
        assertEquals(Coordinate.create(0, 4), Board.create(10).opposite(Coordinate.create(10, 4)));
    }

    @Test
    public void opposite_coordinate_out_of_lower_limit(){
        assertEquals(Coordinate.create(9, 4), Board.create(10).opposite(Coordinate.create(-1, 4)));
    }

    @Test
    public void opposite_coordinate_out_of_right_limit(){
        assertEquals(Coordinate.create(5, 0), Board.create(10).opposite(Coordinate.create(5, 10)));
    }

    @Test
    public void opposite_coordinate_out_of_left_limit(){
        assertEquals(Coordinate.create(5, 9), Board.create(10).opposite(Coordinate.create(5, -1)));
    }

    @Test
    public void opposite_coordinate_within_limits(){
        assertEquals(Coordinate.create(0, 0), Board.create(10).opposite(Coordinate.create(0, 0)));
        assertEquals(Coordinate.create(9, 9), Board.create(10).opposite(Coordinate.create(9, 9)));
    }
}
