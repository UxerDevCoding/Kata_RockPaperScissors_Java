package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {

    @Test
    
    public void isPaper() {
        Paper paper = new Paper();
        String result = paper.getName();
        assertEquals("Paper", result);
    }
    
}
