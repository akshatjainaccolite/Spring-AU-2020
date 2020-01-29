package com.main;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Address;
import com.model.OrderHistory;
import com.model.Product;
import com.model.UserDetails;

import antlr.CppCodeGenerator;

public class Main {
	private static void loadUsers(Session session) {
		UserDetails u1=new UserDetails();
		
		u1.setName("Akshat");
		u1.setUserName("Akshat");
		u1.setPassword("Akshat");
		Address ad1=new Address();
		ad1.setHouse_no(23);
		ad1.setCity("Bengaluru");
		ad1.setState("Karnataka");
		ad1.setPincode(560124);
		u1.setAddress(ad1);
		session.save(u1);
		
		UserDetails u2=new UserDetails();
		u2.setName("Abhijith");
		u2.setUserName("Abhi");
		u2.setPassword("abhi123");
		Address ad2=new Address();
		ad2.setHouse_no(6);
		ad2.setCity("Hubli");
		ad2.setState("Karnataka");
		ad2.setPincode(540293);
		u2.setAddress(ad2);
		session.save(u2);
		
		
		
		session.getTransaction().commit();
		
	}
	private static void loadProducts(Session session) {
		Product p1=new Product();
		p1.setId(10);
		p1.setName("Trimmer");
		p1.setPrice(450);
		p1.setQuantity(25);
		
		session.save(p1);
		
		Product p2=new Product();
		p2.setId(11);
		p2.setName("T-shirt");
		p2.setPrice(200);
		p2.setQuantity(100);
		
		session.save(p2);
		try {
			session.getTransaction().begin();
		}
		catch (Exception e) {
		}
		session.getTransaction().commit();
		
	}
	private static void buyProducts(Session session,String un) {
		TypedQuery tq=session.getNamedQuery("getProducts");
		List<Product> products=tq.getResultList();
		products.forEach((p)->{
			System.out.println("Product Id:"+p.getId()+"\tProduct Name:"+p.getName()+"\n"
					+ "Product Price:"+p.getPrice()+"\tProduct Quantity:"+p.getQuantity());
		});
		System.out.println("Enter the Product id to buy.");
		int pid=scanner.nextInt();
		TypedQuery validateProductId=session.getNamedQuery("validateProductId");
		validateProductId.setParameter("id", pid);
		List<Product> p=validateProductId.getResultList();
		if(p!=null&&p.size()==1)
		{
			try {
				session.getTransaction().begin();
			}catch (Exception e) {
				
			}
			Product product=p.get(0);
			TypedQuery getUser=session.getNamedQuery("getUser");
			getUser.setParameter("un", un);
			UserDetails user=(UserDetails)( getUser.getResultList().get(0));
			product.setQuantity(product.getQuantity()-1);
			TypedQuery updateQty=session.getNamedQuery("updateQty");
			updateQty.setParameter("qty", product.getQuantity());
			updateQty.setParameter("id", product.getId());
			OrderHistory orderHistory=new OrderHistory();
			orderHistory.setProduct(product);
			orderHistory.setUd(user);

			
			session.save(orderHistory);
			int ra=updateQty.executeUpdate();
			
			session.getTransaction().commit();
			if(ra==1) {
				
				System.out.println("Item bought");
			}
			else {
				System.out.println("There is an error in buying an item");
			}
		}
		else {
			System.out.println("Enter valid Product Id.");
		}
	}
	private static void showOrderHistory(Session session,String un) {
		TypedQuery getOrderHistory=session.getNamedQuery("getOrderHistory");
		getOrderHistory.setParameter("un", un);
		List<OrderHistory> orderHistory=getOrderHistory.getResultList();
		if(orderHistory!=null&&orderHistory.size()>0) {
			for(int i=0;i<orderHistory.size();i++) {
				Product p=orderHistory.get(i).getProduct();
				System.out.println(p.getId()+"->"+p.getName());
			}
		}
		else {
			System.out.println("Nothing to display");
		}
	}
	private static Scanner scanner;
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		
		scanner=new Scanner(System.in);

	
		loadUsers(session);
		loadProducts(session);
		
		System.out.println("Enter Username");
		String un=scanner.next();
		System.out.println("Enter Password");
		String pass=scanner.next();
		
		Query q=session.createQuery("from UserDetails where userName='"+un+"' and password='"+pass+"'");
		List<UserDetails> l=q.list();
		if(l!=null&&l.size()==1) {
			System.out.println("Login successfull");
			boolean terminate=false;
			while(terminate==false) {
				System.out.println("1:Buy Product\n2:View order history");
				
				int o=scanner.nextInt();
				
				switch (o) {
				case 1:
					buyProducts(session,un);
					break;
				case 2:
					showOrderHistory(session, un);				
					break;
				default:
					terminate=true;
					break;
				}
			}
		}
		else {
			System.out.println("Login not successfull");
		}
		
		session.close();
	}
}
