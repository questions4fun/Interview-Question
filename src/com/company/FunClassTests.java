package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunClassTests {

    @Test
    public void emptyString() {
        FunClass test = new FunClass();
        assertEquals(0, test.longestWord(""));
    }

    @Test
    public void normalString() {
        FunClass test = new FunClass();
        assertEquals(6, test.longestWord("The cow jumped over the moon."));
    }

    @Test
    public void nullCheck() {
        FunClass test = new FunClass();
        assertEquals(0, test.longestWord(null));
    }

    @Test
    public void specialCharacters() {
        FunClass test = new FunClass();
        assertEquals(1, test.longestWord("< > \" & \n \t \r \f \\"));
    }
}
