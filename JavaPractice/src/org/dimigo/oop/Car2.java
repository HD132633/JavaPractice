package org.dimigo.oop;

public class Car2 {
	public String company;
	public String model;
	public String color;
	public int maxSpeed;
	public int price;
	
	public Car2(String newcompany, String newmodel, String newcolor, int newmaxspeed, int newprice) {
		company=newcompany;
		model=newmodel;
		color=newcolor;
		maxSpeed=newmaxspeed;
		price=newprice;
	}
	
	public String getCompany()
	{
		return company;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	public int getPrice()
	{
		return price;
	}
}
