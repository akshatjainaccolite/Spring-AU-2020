package com.spring.building;

public class Build {

	public static void main(String[] args) {
		Building2 b2 = new Home2(); 
        Contractor contract = new Contractor(b2); 
  
        contract.constructHouse(); 
  
        Home home = contract.getHome(); 
  
        

	}

}
