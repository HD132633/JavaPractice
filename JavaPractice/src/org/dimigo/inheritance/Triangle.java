package org.dimigo.inheritance;

public class Triangle extends Figure{
	
	private int width;
	private int height;
	
	public Triangle(int width, int height){
		super(0,0);
	}
	
	public Triangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.width=width;
		this.height=height;
	}
	
	@Override
	protected double calcArea(){
		return width*height/2;
	}
	
	protected void printCenter(){
		System.out.print("삼각형");
		super.printCenter();
	}
}
