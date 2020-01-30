package com.spring.building;

public class Home implements Building {
	private String basement; 
    private String structure; 
    private String roof; 
    private String interior;
    private String roomtype;
    private int room;
	 public void setBasement(String basement)  
	    { 
	        this.basement = basement; 
	    } 
	  
	    public void setStructure(String structure)  
	    { 
	        this.structure = structure; 
	    } 
	  
	    public void setRoof(String roof)  
	    { 
	        this.roof = roof; 
	    } 
	  
	    public void setInterior(String interior)  
	    { 	        
	    	this.interior = interior; 
	    }
	    public void setRoomtype(String roomtype)  
	    { 	        
	    	this.roomtype = roomtype; 
	    }
	    public void setRoom(int room)  
	    { 	        
	    	this.room = room; 
	    }
}
