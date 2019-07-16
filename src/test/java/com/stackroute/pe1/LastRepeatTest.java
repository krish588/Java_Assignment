package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastRepeatTest {
    LastRepeat lastRepeat;

    @Before
    public void setup() {
        this.lastRepeat = new LastRepeat();
    }

    @Test
    public void inputAStringAndNumberReturnLastDigitsRepeating() {
        //act
        String result = lastRepeat.lastRepeat("java", 2);
        //assert
        assertEquals("javavava",result);
    }
}