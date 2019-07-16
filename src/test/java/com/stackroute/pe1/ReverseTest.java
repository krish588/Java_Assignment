package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse reverse;

    @Before
    public void setup() {
        this.reverse = new Reverse();
    }

    @Test
    public void inputStringShouldReturnReverse() {
        //act
        String result = reverse.reverse("abcdef");
        //assert
        assertEquals("fedcba", result);
    }

}