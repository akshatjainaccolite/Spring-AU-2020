package com.spring.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result =JUnitCore.runClasses(main.class);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result:  "+result.wasSuccessful());
		System.out.println("Count:   "+result.getRunCount());
		System.out.println("Failure:  "+result.getFailureCount());
		System.out.println("Run time:  "+result.getRunTime());
		
		List<Failure> al=new ArrayList<Failure>();
		al.addAll(result.getFailures());
		for (Failure temp : al) {
			System.out.println("Failure point  : "+temp);
			System.out.println("-------------------------------------------------------------------------------------------------");
		}
		System.out.println("==========================================Thank You=========================================");
		
		

	}

}
