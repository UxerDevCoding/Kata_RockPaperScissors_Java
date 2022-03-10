package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScissorsTest {

    @Test

    public void isScissors() {

        Scissors scissors = new Scissors();
        String result = scissors.getName();
        assertEquals("Scissors", result);
    }
    
}
