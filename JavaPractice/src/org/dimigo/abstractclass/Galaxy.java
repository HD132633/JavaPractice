package org.dimigo.abstractclass;

public class Galaxy extends SmartPhone{

	public Galaxy(){ }
	public Galaxy(String model, String company, int price){
		super("갤럭시 S6","삼성",650000);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
