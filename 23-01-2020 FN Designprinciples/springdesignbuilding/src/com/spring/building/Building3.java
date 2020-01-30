package com.spring.building;

public class Building3 implements Building2 {
	private Home home; 
	  
    public Building3()  
    { 
        this.home = new Home(); 
    } 
  
    public void buildBasement()  
    { 
    	home.setBasement("Poles"); 
    } 
  
    public void buildStructure()  
    { 
    	home.setStructure("Wood"); 
    } 
  
    public void buildInterior()  
    { 
    	home.setInterior("Tiles"); 
    } 
  
    public void bulidRoof()  
    { 
    	home.setRoof("POP2"); 
    } 
  
    public Home getHome()  
    { 
        return this.home; 
    } 
    public void buildsetRoomtype() {
		home.setRoomtype("Super deluxe");
		
	}
	public void buildsetRoom() {
		home.setRoom(05);
		
	}
	
}
