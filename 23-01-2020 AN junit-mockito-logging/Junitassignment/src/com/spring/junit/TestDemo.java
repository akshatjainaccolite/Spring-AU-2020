package com.spring.junit;
//import static org.junit.Assert.assertEquals;



import java.util.Scanner;

import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InOrder;

public class TestDemo {
	Scanner scan=new Scanner(System.in);
	@Test
	public void teststr1() {
		String abc="This is a string";
		Assert.assertEquals("This is a string",abc);
	}
	
	@Test
	public void teststr2() {
		String str="This is a test";
		Assert.assertEquals("This is test",str);
	}
	@Test
	public void testadd1() {
		System.out.println("Enter First Number");
		int a=scan.nextInt();
		System.out.println("Enter Second Number");
		int b=scan.nextInt();
		System.out.println("Enter Result acoording to you");
		int c=scan.nextInt();
		Assert.assertEquals(a+b, c); 
	}
	@Test
	public void testadd2() {
		int a=10;
		int b=10;
		Assert.assertEquals(a+b, 22);
		
	}
	@Test
	public void testsubtract1() {
		int a=20;
		int b=10;
		Assert.assertEquals(a-b, 10);
	}
	@Test
	public void testsubtract2() {
		int a=20;
		int b=10;
		Assert.assertEquals(a-b, 12);
	}
	@Test
	public void testdivide1() {
		int a=20;
		int b=10;
		Assert.assertEquals(a/b, 2);
		Assert.assertEquals(a/b, 2);
	}
	@Test
	public void testdivide2() {
		int a=20;
		int b=10;
		Assert.assertEquals(a/b, 3);
	}
	@Test
	public void mul1() {
		int a=20;
		int b=10;
		Assert.assertEquals(a*b, 200);
	}
	@Test
	public void mul2() {
		int a=20;
		int b=10;
		Assert.assertEquals(a*b, 202);
	}

}
