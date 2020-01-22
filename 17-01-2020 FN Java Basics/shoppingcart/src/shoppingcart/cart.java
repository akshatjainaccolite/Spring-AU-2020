package shoppingcart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class cart extends Product{
	Scanner s=new Scanner(System.in);
	Integer id;
	Integer quantityc;
	Double rate;
	double amount=0;
	
	public cart() {
	
	}
	public cart(int id,int quantity,Double rate) {
		this.id=id;
		this.quantityc=quantity;
		this.rate=rate;
	}
	Map< Integer,cart> m1 =  new HashMap< Integer,cart>();
	public void add() {
		if(Product.product.isEmpty()==false) {
		System.out.println("Following are the Items In Store: ");
		Product.Display();
		System.out.println("Enter Total Product want to add in cart ");
		int n=s.nextInt();
		while(n!=0) {
		System.out.println("Enter Product id");
		id=s.nextInt();
		System.out.println("Confirm Product id");
		int id1=s.nextInt();
		if(product.containsKey(id)&&id==id1) {
		System.out.println("Enter Product Quantity");
		quantityc=s.nextInt();
		System.out.println("Enter rate");
		rate=s.nextDouble();
		m1.put(id,new cart(id1,quantityc,rate));
		amount+=quantityc*rate;
		Product.update(id,quantityc,rate);
		}
		else {
			System.out.println("Product Is Not Available For that much quantity");
			System.exit(0);
		}
		n--;
		}	
		
		}
		else {
			System.out.println("EMPTY STORE");
		}
		
	}

	@SuppressWarnings("static-access")
	public void remove() {
		if(m1.isEmpty()==false) {
		int quantity2=0;
		Double rate2 = null;
		System.out.println("Enter the Product Id to remove");
		Integer pid=s.nextInt();
		Double rate = null;
		if(m1.containsKey(pid)) {
			Set<Entry<Integer, Product>> st = product.entrySet();
			for (Entry<Integer, Product> me:st) {
				if(pid==me.getKey()) {
				quantity2=me.getValue().quantity;
				rate2=me.getValue().rate;
				Product.update2(pid,quantity2,rate2);
				m1.remove(pid);
				break;
			 }
			}
			amount-=quantity2*rate2;
		}
		else {
			System.out.println("Product is not in cart");
		}
		}
		else {
			System.out.println("CART IS EMPTY");
		}
		
		
	}

	
	public void view() {
		if(m1.isEmpty()==false) {
		System.out.println("Your Cart Contains:");
		Set<Entry<Integer, cart>> st = m1.entrySet();
		for (Entry<Integer, cart> me:st) 
	       { 
	           System.out.print("Product Id:   " +me.getKey()+":"); 
	           System.out.println("Product Quantity:   " +me.getValue().quantityc); 
	       } 
		System.out.println("YOUR TOTAL AMOUNT IS:"+amount);
		}
		else {
			System.out.println("EMPTY CART");
		}
	}
	public void cancel() {
		if(m1.isEmpty()==false) {
		Set<Entry<Integer, cart>> st1 = m1.entrySet();
		for (Entry<Integer, cart> me:st1) 
	       { 
	           int id=me.getKey();
	           int quant=me.getValue().quantityc;
	           Double rate=me.getValue().rate;
	           Product.update3(id, quant);
	           amount-=quant*rate;
	       } 
		
		m1.clear();
		System.out.println("YOUR TOTAL AMOUNT IS:"+amount);
		}
		else {
			System.out.println("CART IS ALREADY EMPTY");
		}
		
	}
	

}
