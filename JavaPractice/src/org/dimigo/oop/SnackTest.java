package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Snack[] snack = new Snack[]{
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칲","크파운",1200,1),
				new Snack("허니버터칩","해태",1500,4)};
		
		snack[0].printSnack();
		snack[1].printSnack();
		snack[2].printSnack();
		
		System.out.println("총 구매 금액 : "+String.format("%,d",snack[0].calcPrice()+snack[1].calcPrice()+snack[2].calcPrice())+"원");
	}

}
