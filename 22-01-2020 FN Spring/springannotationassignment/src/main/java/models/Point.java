package models;

import org.springframework.stereotype.Service;


public class Point {
	private int  x;
	private int y;
	
	public Point() {}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;	
	}
	
	public void setx(int x) {
		this.x=x;
	}
	public void sety(int y) {
		this.y=y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public void draw() {
		System.out.println("x is:"+x);
		System.out.println("y is:"+y);
	}
	
	

}
