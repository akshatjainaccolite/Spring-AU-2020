package shoppingcart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Product {

	private Integer productid;
    protected String productname;
    protected Integer quantity;
    protected static Double rate;
    Scanner s=new Scanner(System.in);
    public Product () {       
    }
    public Product (String productname, Double rate, Integer quantity) {
        
        this.productname = productname;
        this.quantity = quantity;
        this.rate = rate;
    }
   public static Map< Integer,Product> product =  new HashMap< Integer,Product>();
	public void add() {
		System.out.println("Enter Total Products you want to add to store:-");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter Product Details:");
		System.out.println(" ");
		System.out.println("Enter Id:");
		productid=s.nextInt();
		System.out.println("Enter Name:");
		productname=s.next();
		System.out.println("Enter Quantity:");
		quantity=s.nextInt();
		System.out.println("Enter Rate:");
		rate=s.nextDouble();
		product.put(productid,new Product (productname,rate,quantity));
		System.out.println("Product added");
		}
		
		
		
	}
	public static void Display() {
		if(product.isEmpty()==false) {
		System.out.println("Your Shop Contains:");
		Set<Entry<Integer, Product>> st = product.entrySet();
		for (Entry<Integer, Product> me:st) 
	       { 
	           System.out.print("Product Id:  " +me.getKey()+" "); 
	           System.out.println("Product Name:  "+me.getValue().productname+" " ); 
	           System.out.println("Product Quantity:  "+me.getValue().quantity+" " ); 
	           System.out.println("Product Rate:  "+me.getValue().rate+" " ); 
	           System.out.println("--------------");
	       } 
		}
		else {
			System.out.println("PLEASE ADD PRODUCT IN STORE");
		}
		
	}
	public static void update(int id,int quantityc,Double rate2) {
		int quant = 0;
		String quantname = null;
		Set<Entry<Integer, Product>> st = product.entrySet();
		for (Entry<Integer, Product> me:st) {
			if (me.getKey()==id) {
				quantname=me.getValue().productname;
				quant=me.getValue().quantity-quantityc;
				break;
			}
		}
		product.replace(id, new Product(quantname,rate,quant));
		
		
	}
	public static void update2(Integer pid, int quantity2, Double rate2) {
		int quant = 0;
		String quantname = null;
		Set<Entry<Integer, Product>> st = product.entrySet();
		for (Entry<Integer, Product> me:st) {
			if (me.getKey()==pid) {
				quantname=me.getValue().productname;
				quant=me.getValue().quantity+quantity2;
				break;
			}
		}
		product.replace(pid, new Product(quantname,rate,quant));
		
		
	}
	public static void update3(int id, int quant) {
		int quant1 = 0;
		Double Rate1=(double) 0;
		String quantname = null;
		Set<Entry<Integer, Product>> st = product.entrySet();
		for (Entry<Integer, Product> me:st) {
			if (me.getKey()==id) {
				quantname=me.getValue().productname;
				quant1=me.getValue().quantity+quant;
				Rate1=me.getValue().rate;
				break;
			}
		}
		product.replace(id, new Product(quantname,rate,quant1));
		
	}
   
}
