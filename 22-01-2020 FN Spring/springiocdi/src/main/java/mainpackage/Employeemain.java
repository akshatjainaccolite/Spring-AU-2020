package mainpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Emp;

public class Employeemain {

	public static void main(String[] args) {
		System.out.println("hey");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Emp emp = (Emp) context.getBean("Emp");
		emp.empdetails();

	}

}
