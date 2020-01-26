package model;

public class Employee {
	 public String fname;
	 public String lname;
	 public String city;
	 public String State;
	
	public Employee() {
		
	}
	public Employee(String fname,String lname,String State,String city) {
		this.fname=fname;
		this.lname=lname;
		this.State=State;
		this.city=city;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	
	
}
