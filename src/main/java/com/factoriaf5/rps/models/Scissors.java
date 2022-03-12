package com.factoriaf5.rps.models;

import com.factoriaf5.rps.designPattern.Interface;

public class Scissors implements Interface {

    public String name = "Scissors";

    public Scissors() {  
    }

    public Scissors(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    
    
}
