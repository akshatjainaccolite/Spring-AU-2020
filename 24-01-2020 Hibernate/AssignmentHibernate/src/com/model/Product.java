package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({@NamedQuery(name = "getProducts",query = "from Product where quantity>0"),
				@NamedQuery(name = "validateProductId",query = "from Product where id=:id"),
				@NamedQuery(name="updateQty", query="UPDATE Product set quantity= :qty where id=:id")
})

@Entity
public class Product {
	
	
	
	@Id
	private int id;
	private String name;
	
	private int quantity;
	private double price;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
