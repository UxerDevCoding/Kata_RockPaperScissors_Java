package com.factoriaf5.rps.models;

import com.factoriaf5.rps.designPattern.Interface;

public class Paper implements Interface {

    public String name = "Paper";

    public Paper() {  
    }

    public Paper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    
}
