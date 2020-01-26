package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aspect.EmployeeAspect;
import com.spring.service.Employeeservice;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("hey");
		Employeeservice employeeService = (Employeeservice) ctx.getBean(Employeeservice.class);
		
		employeeService.getdetails();
		System.out.println("Execution time is:"+EmployeeAspect.exec());

	}

}
