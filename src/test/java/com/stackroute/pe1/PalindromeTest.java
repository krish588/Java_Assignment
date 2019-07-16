package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setup() {
        this.palindrome = new Palindrome();
    }

    @Test
    public void inputANumberReturnPalindromeAndcheckEvenSumIsGreater() {
        //act
        String result = palindrome.PalindromeChecker(888858888);
        //assert
        assertEquals("palindrome Even number sum is greater than 25", result);

    }
    @Test
    public void inputANumberReturnPalindromeAndcheckEvenSumIsLesser() {
        String result = palindrome.PalindromeChecker(12321);
        assertEquals("palindrome Even number sum is lesser then 25", result);
    }

    @Test
    public void inputANumberNotPalindrome() {
        String result = palindrome.PalindromeChecker(1234);
        assertEquals( "not palindrome", result);
    }

}