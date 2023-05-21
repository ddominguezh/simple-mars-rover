package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoordinateTest {
    
    @Test
    public void move_from_north_direction(){
        assertEquals(Coordinate.create(3, 4), Coordinate.create(2, 4).move(Direction.NORTH));
    }
}
