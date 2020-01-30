package com.spring.mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.accolite.Emp;
import com.spring.dao.EmpDao;

@RunWith(MockitoJUnitRunner.class)
public class MockMvc {
	
	@Mock
	EmpDao dao;
	@Test
	public void mock() {
		Scanner scan =new Scanner(System.in);
		List<Emp> emp=new ArrayList<Emp>();
		int id;
		String name;
		System.out.println("Enter Id:");
		id=scan.nextInt();
		System.out.println("Enter Name:");
		name=scan.next();
		emp.add(new Emp(id,name));
		when(dao.getEmployees()).thenReturn(emp);
		dao.getEmployees().forEach((e)->{
			System.out.println("ID:  "+e.getId()+"\nName:   "+e.getName()+"\n");
		});
		
		
	}

	
	
	
	
}
