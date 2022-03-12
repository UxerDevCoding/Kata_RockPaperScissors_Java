package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;

import com.factoriaf5.rps.designPattern.Factory;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

import org.junit.Test;

public class PatternGameTest {
    
    @Test

    public void rockWinScissors(){
        Game game = new Game();
        new Factory();
        String result = game.playGame(Factory.getObject(Rock), Factory.getObject(Scissors));
        assertEquals("Rock win", result);

    }
}
