package com.spring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.spring.model.Employee;

@Component
public class Employeeservice {

private Employee employee;
	ArrayList<Employee> l=new ArrayList<Employee>();
	   public void getdetails() {
		   l.add(new Employee(1,"Akshat"));
		   l.add(new Employee(2,"Aksh"));
		   l.add(new Employee(3,"Akshat jain"));
		   l.add(new Employee(4,"Akj"));
		   
		   
		   for (Employee e : l)
		      { 		      
		           System.out.println("Id is "+e.getId()+
		        		   			  " |  Name is "+e.getName()
		        		   				); 	
		           System.out.println("----------------------------");
		      }
		   
	   }
	   
	
}
