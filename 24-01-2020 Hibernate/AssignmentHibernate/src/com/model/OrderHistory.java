package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@NamedQueries({@NamedQuery(name="getOrderHistory", query = "from OrderHistory where username=:un")})
@Entity
public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@ManyToOne
	@JoinColumn(name = "Username")
	private UserDetails ud;
	@ManyToOne
	@JoinColumn(name = "ProductId")
	private  Product product;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public UserDetails getUd() {
		return ud;
	}
	public void setUd(UserDetails ud) {
		this.ud = ud;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
