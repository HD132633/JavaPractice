package org.dimigo.inheritance;

public class Circle extends Figure{
	private int radius;
	
	public Circle(int radius){
		super(0,0);
		this.radius=radius;
	}
	
	public Circle(int x, int y, int radius){
		super(x, y);
		this.radius=radius;
	}
	
	@Override
	protected double calcArea(){
		return Math.PI*radius*radius;
	}
	
	protected void printCenter(){
		System.out.print("원");
		super.printCenter();
	}

}
