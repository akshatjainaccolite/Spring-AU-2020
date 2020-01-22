package shoppingcart;

import java.util.Scanner;

public class ShoopingCart {
		 static cart c=new cart();
		 static Product p=new Product();

	public static void main(String[] args) {
		while(true) {
			System.out.println("\t\tSELECT OPTIONS:");
			System.out.println("\t\t---------------");
		System.out.println("1.Add product to Store \n2.Add product to Cart \n3.Remove product from cart \n4.View items in cart \n5.Place order \n6.Cancel order  \n7.EXIT");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch (choice) {
		case 1:p.add();
		break;
		case 2:c.add();
		break;
		case 3:c.remove();
		break;
		case 4:c.view();
		break;
		case 5:c.view();
		break;
		case 6:c.cancel();
		break;
		default: return;	    
		}	
		
		}
	}
		

	

}
