package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DirectionTest {
    
    @Test
    public void move_from_north_direction_to_the_left(){
        assertEquals(Direction.EAST, Direction.NORTH.move(Move.LEFT));
    }

    @Test
    public void move_from_east_direction_to_the_left(){
        assertEquals(Direction.SOUTH, Direction.EAST.move(Move.LEFT));
    }

    @Test
    public void move_from_south_direction_to_the_left(){
        assertEquals(Direction.WEST, Direction.SOUTH.move(Move.LEFT));
    }

    @Test
    public void move_from_west_direction_to_the_left(){
        assertEquals(Direction.NORTH, Direction.WEST.move(Move.LEFT));
    }

    @Test
    public void move_from_north_direction_to_the_right(){
        assertEquals(Direction.WEST, Direction.NORTH.move(Move.RIGHT));
    }
}
