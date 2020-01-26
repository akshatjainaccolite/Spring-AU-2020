package com.spring.aspect;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class EmployeeAspect {
	
	
	static long starttime;
	static long endtime;
	static long executiontime;
	  @Before("execution(* com.spring.service.Employeeservice.getdetails(..))")
	     public void start(JoinPoint joinPoint) {
	    	 System.out.println("START");
	    	 starttime = System.nanoTime();
	    	 System.out.println("Start time is:"+starttime);
	     }
	  @After("execution(* com.spring.service.Employeeservice.getdetails(..))")
	  public void end() {
		  long endtime = System.nanoTime();
		  System.out.println("END");
		  System.out.println("End time is:"+endtime);
	  }
	  public static long exec() {
		  executiontime=starttime-endtime;
		  return executiontime;
	  }
	 

}
