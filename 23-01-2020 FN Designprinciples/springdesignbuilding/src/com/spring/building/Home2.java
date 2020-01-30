package com.spring.building;

public class Home2 implements Building2{
	private Home home; 
	  
    public Home2()  
    { 
        this.home = new Home(); 
    } 
  
    public void buildBasement()  
    { 
        home.setBasement("Bars"); 
    } 
  
    public void buildStructure()  
    { 
        home.setStructure("Blocks"); 
    } 
  
    public void buildInterior()  
    { 
        home.setInterior("Paints"); 
    } 
  
    public void bulidRoof()  
    { 
        home.setRoof("Concrete"); 
    } 
  
    public Home getHome()  
    { 
        return this.home; 
    }


	public void buildsetRoomtype() {
		home.setRoomtype("Deluxe");
		
	}

	
	public void buildsetRoom() {
		home.setRoom(10);
		
	}

	
}
