package com.spring.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo2 {

	
	@Test
	public void testadd() {
		String str="This is a test";
		Assert.assertEquals("This isa test",str);
	}
}
