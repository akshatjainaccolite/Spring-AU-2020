package com.spring.building;

public class Contractor {
	private Building2 building2; 
	  
    public Contractor(Building2 building2) 
    { 
        this.building2 = building2; 
    } 
  
    public Home getHome() 
    { 
        return this.building2.getHome(); 
    } 
  
    public void constructHouse() 
    { 
        this.building2.buildBasement(); 
        this.building2.buildStructure(); 
        this.building2.bulidRoof(); 
        this.building2.buildInterior(); 
    } 

}
