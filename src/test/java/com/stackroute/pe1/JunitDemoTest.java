package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
    public void setup() {
        //        arrange
        System.out.println("Inside Before");
        this.junitDemo = new JunitDemo();
    }
//freeup all the alloctated memory for every test
    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.junitDemo=null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
//        this.junitDemo = new JunitDemo();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void givenTwoStringsShouldReturnConatedUpperString() {
//        arrange
//        JunitDemo junitDemo = new JunitDemo();
//        act
        String result=junitDemo.concatAndUpperCase("jarvis", "ironman");
//        asssert
        assertNotNull(result);
        assertEquals("JARVISIRONMAN", result);

    }

    @Test
    public void givenAStringNullShouldReturnErrorMessage() {
//        arrange
        JunitDemo junitDemo = new JunitDemo();
//        act
        String result=junitDemo.concatAndUpperCase(null,null);
//        asssert
        assertNotNull(result);
        assertEquals("Null value not allowed", result);
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String result = junitDemo.reverseString("jarvis");
        //assert
        assertEquals("sivraj", result);
    }

    @Test
    public void givenNullShouldThrowNullPointException() {
        //act
        String result = junitDemo.reverseString(null);
        //assert
        assertEquals("Null value not allowed",result);

    }
}