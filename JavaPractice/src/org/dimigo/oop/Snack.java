package org.dimigo.oop;

public class Snack {

	public String name;
	public String company;
	public int price;
	public int number;
	
	public Snack(){
		
	}
	
	public Snack(String newname, String newcompany, int newprice, int newnumber){
		name=newname;
		company=newcompany;
		price=newprice;
		number=newnumber;
	}
	
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack(){		
		System.out.println("이름 : "+name);
		System.out.println("제조사 : "+company);
		System.out.println("가격 : "+String.format("%,d",price)+"원");
		System.out.println("개수 : "+String.format("%,d",number)+"개");
		System.out.println();
	}
	
	public int calcPrice()
	{
		return price*number;
	}
	
	
}
