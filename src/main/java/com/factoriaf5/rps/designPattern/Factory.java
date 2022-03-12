package com.factoriaf5.rps.designPattern;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Factory {

   public Interface getObject(String Object){
    if(Object == null){
       return null;
    }		
    if(Object.equals("Paper")){
       return new Paper();
       
    } else if(Object.equals("Rock")){
       return new Rock();
       
    } else if(Object.equals("Scissors")){
       return new Scissors();
    }
    
    return null;
 }
    
}
