package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    
    @Test
    public void rotate_left(){
        assertEquals("0:0:E", MarsRover.create().execute("L"));
    }

    @Test
    public void rotate_right(){
        assertEquals("0:0:W", MarsRover.create().execute("R"));
    }

    @Test
    public void move(){
        assertEquals("0:1:N", MarsRover.create().execute("M"));
    }

    @Test
    public void rotate_left_and_move(){
        assertEquals("9:0:E", MarsRover.create().execute("LM"));
    }

    @Test
    public void rotate_right_and_move(){
        assertEquals("1:0:W", MarsRover.create().execute("RM"));
    }

    @Test
    public void move_mars_rovers(){
        assertEquals("2:3:N", MarsRover.create().execute("MMRMMLM"));
        assertEquals("0:0:N", MarsRover.create().execute("MMMMMMMMMM"));
    }

}
