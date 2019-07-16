package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration iteration;

    @Before
    public void setup() {
        this.iteration = new Iteration();
    }

    @Test
    public void iteration() {
        //act
        String result= iteration.iteration(4);
        //assert
        assertEquals("1223334444", result);
    }
}