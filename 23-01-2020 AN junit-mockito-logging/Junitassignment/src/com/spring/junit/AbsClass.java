package com.spring.junit;

import junit.framework.TestCase;

public class AbsClass extends TestCase{
 
	protected int val1,val2;
	protected void aetup() {
		val1=10;
		val2=13;
		
		
	}
	public void testadd1() {
		double result=val1+val2;
		assertTrue(result==6);
		
	}
	protected void tearDown() {
	
		
	}
}
