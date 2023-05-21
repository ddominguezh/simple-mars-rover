package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoordinateTest {
    
    @Test
    public void move_from_north_direction(){
        assertEquals(Coordinate.create(3, 4), Coordinate.create(2, 4).move(Direction.NORTH));
    }

    @Test
    public void move_from_east_direction(){
        assertEquals(Coordinate.create(2, 3), Coordinate.create(2, 4).move(Direction.EAST));
    }

    @Test
    public void move_from_south_direction(){
        assertEquals(Coordinate.create(1, 4), Coordinate.create(2, 4).move(Direction.SOUTH));
    }

    @Test
    public void move_from_west_direction(){
        assertEquals(Coordinate.create(2, 5), Coordinate.create(2, 4).move(Direction.WEST));
    }
}
