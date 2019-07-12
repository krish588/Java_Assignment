package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomnJerryTest {
    TomnJerry tomnJerry;

    @Before
    public void Setup() {
        this.tomnJerry = new TomnJerry();
    }

    @Test
    public void enterNumberFindTom() {
        //act
        String result = tomnJerry.tomNJerry(21);
        //assert
        assertEquals("Tom", result);
    }

    @Test
    public void enterNumberFindJerry() {
        //act
        String result = tomnJerry.tomNJerry(22);
        //assert
        assertEquals("Jerry", result);
    }

}