package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyTypeTest {
    IdentifyType identifyType;

    @Before
    public void setup() {
        this.identifyType = new IdentifyType();
    }

    @Test
    public void identifyTypeLower() {
        //act
        String result = identifyType.identifyType('a');
        //assert
        assertEquals("Lower case",result);
    }
    @Test
    public void identifyTypeUpper() {
        //act
        String result = identifyType.identifyType('A');
        //assert
        assertEquals("Upper case",result);
    }
    @Test
    public void identifyTypeNumber() {
        //act
        String result = identifyType.identifyType('2');
        //assert
        assertEquals("Number",result);
    }
    @Test
    public void identifyTypeSpecialSymbol() {
        //act
        String result = identifyType.identifyType('@');
        //assert
        assertEquals("Special Symbol",result);
    }
}