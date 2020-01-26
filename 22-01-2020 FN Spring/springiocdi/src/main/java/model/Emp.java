package model;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class Emp {
	 public Map<Integer,Employee> empdetails;
	 public Emp() { 
	 }
	 public Emp(Map<Integer,Employee> empdetails) {
		 this.empdetails=empdetails;
	 }
	 
	public void empdetails() {
		Set<Entry<Integer, Employee>> st = empdetails.entrySet();
		for (Entry<Integer, Employee> me:st) {
            System.out.println("Key = " + me.getKey() + 
                              "| first name = " +me.getValue().fname+
                              "| last name = " +me.getValue().lname+
                              "| city = " + me.getValue().city+
                              "|State = " + me.getValue().State);		
	}
}
}
