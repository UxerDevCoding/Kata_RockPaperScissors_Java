package com.factoriaf5.rps.models;

import com.factoriaf5.rps.designPattern.Interface;

public class Rock implements Interface {

    public String name = "Rock";

    public Rock() {  
    }

    public Rock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    
}
