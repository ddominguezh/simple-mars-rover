package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DirectionTest {
    
    @Test
    public void rotate_from_north_direction_to_the_left(){
        assertEquals(Direction.EAST, Direction.NORTH.rotate(Rotate.LEFT));
    }

    @Test
    public void rotate_from_east_direction_to_the_left(){
        assertEquals(Direction.SOUTH, Direction.EAST.rotate(Rotate.LEFT));
    }

    @Test
    public void rotate_from_south_direction_to_the_left(){
        assertEquals(Direction.WEST, Direction.SOUTH.rotate(Rotate.LEFT));
    }

    @Test
    public void rotate_from_west_direction_to_the_left(){
        assertEquals(Direction.NORTH, Direction.WEST.rotate(Rotate.LEFT));
    }

    @Test
    public void rotate_from_north_direction_to_the_right(){
        assertEquals(Direction.WEST, Direction.NORTH.rotate(Rotate.RIGHT));
    }

    @Test
    public void rotate_from_west_direction_to_the_right(){
        assertEquals(Direction.SOUTH, Direction.WEST.rotate(Rotate.RIGHT));
    }

    @Test
    public void rotate_from_south_direction_to_the_right(){
        assertEquals(Direction.EAST, Direction.SOUTH.rotate(Rotate.RIGHT));
    }

    @Test
    public void rotate_from_east_direction_to_the_right(){
        assertEquals(Direction.NORTH, Direction.EAST.rotate(Rotate.RIGHT));
    }
}
