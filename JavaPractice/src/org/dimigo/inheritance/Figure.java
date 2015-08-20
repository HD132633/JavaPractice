package org.dimigo.inheritance;

public class Figure {

	public int centerX;
	public int centerY;
	
	public Figure(int centerX, int centerY){
		this.centerX=centerY;
		this.centerY=centerY;
	}
	
	protected double calcArea(){
		return 0.0;
	}
	
	protected void printCenter(){
		System.out.println("중심좌표 : ("+centerX+", "+centerY+")");
	}
	
	protected void moveFigure(int x, int y){
		this.centerX+=x;
		this.centerY+=y;
	}
}
