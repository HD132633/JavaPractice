package org.dimigo.inheritance;

public class IPhone extends SmartPhone{
	
	public IPhone(){}
	public IPhone(String model, String company, int price){
		super("iPhone 6","애플",700000);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}

}
